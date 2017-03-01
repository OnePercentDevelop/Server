package com.onepercent.server.controller;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.onepercent.server.service.WinnerService;

@Controller
public class WinnerController {
	@Resource(name = "WinnerService")
	private WinnerService winnerService;

	// 오늘의 상품 가져오기
		@RequestMapping(value = "/today.do", method = RequestMethod.GET)
		public ModelAndView getTodayQuestion(HttpServletRequest request) throws Exception {
			ModelAndView mv = new ModelAndView("jsonView");
			String vote_date = request.getParameter("vote_date");
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("vote_date", vote_date);
			List<LinkedHashMap<String, Object>> list = winnerService.selectTodayGift(map);
			mv.addObject("todayQuestion", list);
			return mv;
		}
	
	// 당첨자 모두 가져오기
	@RequestMapping(value = "/WinnerResult.do")
	public ModelAndView main(HttpServletRequest request) throws Exception {
		ModelAndView mv = new ModelAndView("jsonView");
		List<LinkedHashMap<String, Object>> list = winnerService.selectWinnerAll();
		mv.addObject("winnerResult", list);
		return mv;
	}

	// 해당 날짜 이후의 당첨자 가져오기
	@RequestMapping(value = "/WinnerResultSince.do", method = RequestMethod.GET)
	public ModelAndView getVoteResultSince(HttpServletRequest request) throws Exception {
		Map<String, Object> map = new HashMap<String, Object>();
		String vote_date = request.getParameter("vote_date");
		map.put("vote_date", vote_date);
		ModelAndView mv = new ModelAndView("jsonView");
		List<LinkedHashMap<String, Object>> list = winnerService.selectWinnerSince(map);
		mv.addObject("winnerResultSince", list);
		return mv;
	}
}

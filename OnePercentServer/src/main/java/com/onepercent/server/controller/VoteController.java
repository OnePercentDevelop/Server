package com.onepercent.server.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.onepercent.server.service.VoteService;

@Controller
public class VoteController {
	@Resource(name = "VoteService")
	private VoteService voteService;

	// vote list display
	@RequestMapping(value = "/voteList.do")
	public ModelAndView voteList(Map<String, Object> commandMap) throws Exception {
		ModelAndView mv = new ModelAndView("voteTable");
		List<Map<String, Object>> list = voteService.selectVoteList(commandMap);
		mv.addObject("vote_list", list);
		return mv;
	}

	// 사용자 투표 내역 가져오기
	@RequestMapping(value = "/userVoteList.do")
	public ModelAndView userVoteList(HttpServletRequest request) throws Exception {
		String user_id = request.getParameter("user_id");
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("user_id", user_id);
		ModelAndView mv = new ModelAndView("jsonView");
		List<Map<String, Object>> list = voteService.selectUserVoteList(map);
		mv.addObject("uservote_list", list);
		return mv;
	}
	// 현재 투표자 수 가져오기
		@RequestMapping(value = "/voteNumber.do")
		public ModelAndView getVoteNumber(HttpServletRequest request) throws Exception {
			String vote_date = request.getParameter("vote_date");
			request.setCharacterEncoding("EUC-KR");
			System.out.println("vote_date : " + vote_date);
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("vote_date", vote_date);
			ModelAndView mv = new ModelAndView("jsonView");
			List<Map<String, Object>> list = voteService.selectVoteNumber(map);
			list.get(0).put("test", "hello");
			mv.addObject("vote_result", list);
			return mv;
		}
	// vote insert
	@RequestMapping("/insertVote.do")
	public ModelAndView voteInser(HttpServletRequest request) throws Exception {
		request.setCharacterEncoding("EUC-KR");
		Map<String, Object> map = new HashMap<String, Object>();
		String user_id = request.getParameter("user_id");
		String vote_date = request.getParameter("vote_date");
		System.out.println("vote_date : " + vote_date);
		System.out.println("user_id : " + user_id);
		int vote_answer = Integer.parseInt(request.getParameter("vote_answer"));

		map.put("vote_date", vote_date);
		map.put("user_id", user_id);
		map.put("vote_answer", vote_answer);
		int vote_state = voteService.insertVote(map);

		ModelAndView mv = new ModelAndView("jsonView");
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		Map<String, Object> list_map = new HashMap<String, Object>();
		System.out.println(vote_state);
		if (vote_state == 1) {
			list_map.put("state", "success");

		} else {
			list_map.put("state", "fail");
		}
		list.add(list_map);
		mv.addObject("vote_result", list);
		return mv;
	}

	// delete vote
	@RequestMapping("/voteDelete.do")
	public void voteDelete(HttpServletRequest request, Map<String, Object> commandMap) throws Exception {
		Map<String, Object> map = new HashMap<String, Object>();
		request.setCharacterEncoding("utf-8");
		int vote_id = Integer.parseInt(request.getParameter("vote_id"));
		System.out.println("vote_id: " + vote_id);
		map.put("vote_id", vote_id);
		voteService.deleteVote(map);
//		ModelAndView mv = new ModelAndView("voteList");
//		List<Map<String, Object>> list = voteService.selectVoteList(commandMap);
//		mv.addObject("vote_list", list);
//		return mv;
	}
}

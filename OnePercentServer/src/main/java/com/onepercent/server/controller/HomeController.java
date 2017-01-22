package com.onepercent.server.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.onepercent.server.service.VoteService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	@Resource(name = "VoteService")
	private VoteService voteService;
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "home.do", method = RequestMethod.GET)
	public String home(Locale locale, Model model) throws Exception {
		logger.info("Welcome home! The client locale is {}.", locale);
		Map<String, Object> map = new HashMap<String, Object>();
		Date date = new Date();
		String vote_date = "";
		int year = 1900+date.getYear();
		int month = date.getMonth()+1;
		int day = date.getDate();
		vote_date = ""+year+"년";
		vote_date += month/10 > 0 ? ""+month+"월" : "0"+month+"월";
		vote_date += day/10 > 0 ? ""+day+"일" : "0"+day+"일";
		map.put("vote_date", vote_date);
		List<Map<String, Object>> list = voteService.selectVoteNumber(map);
//		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
//
//		String formattedDate = dateFormat.format(date);

		model.addAttribute("result", list);

		return "overview";
	}
	// main data
	@RequestMapping(value = "/main.do")
	public ModelAndView main(HttpServletRequest request) throws Exception {
		ModelAndView mv = new ModelAndView("jsonView");
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		Map<String, Object> map = new HashMap<String, Object>();
		map = voteService.todayQuestion();
		list.add(map);
		mv.addObject("main_result", list);
		return mv;
	}
}

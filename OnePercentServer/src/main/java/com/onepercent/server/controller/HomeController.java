package com.onepercent.server.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URLDecoder;
import java.text.DateFormat;
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
		Date date = new Date();
		/************************ 실제로 배포할 때 이부분 사용 ******************************/
//		String today = 1900+date.getYear()+"" + (date.getMonth()+1)+""+date.getDate();
		/***************************************************************************/
		
		String today = "20161102";
		String question_str[] = questionRead(today);
		List<Map<String, String>> example_list = new ArrayList<Map<String, String>>();
		Map<String, String> example_map = new HashMap<String, String>();
		for (int i = 1 ; i < question_str.length-1; i++) {
			example_map.put(""+i,question_str[i]);
			System.out.println(question_str[i]);
		}
		example_list.add(example_map);
		String winner_str = winnerRead(today);
		String gift_str = giftRead(today);
		map.put("today", today);
		map.put("gift_name", gift_str);
		map.put("question", question_str[0]);
		map.put("example", example_list);
		map.put("winner", winner_str);
		map.put("gift_png", "banana.png");
		list.add(map);
		mv.addObject("main_result", list);
		return mv;
	}
	@RequestMapping(value = "/votenumber.do")
	public ModelAndView votenumber(HttpServletRequest request) throws Exception {
		ModelAndView mv = new ModelAndView("jsonView");
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("number", 112);
		list.add(map);
		mv.addObject("vote_result", list);
		return mv;
	}
	public String giftRead(String today) throws IOException {
		String result = "";
		String test = "";
		File file = new File("D://home/temp/onepercent/main/gift/"+today+"gift.txt");
		BufferedReader br = new BufferedReader(new InputStreamReader(
				new FileInputStream(file), "utf-8"));
		while ((test = br.readLine()) != null){
			result += test;
		}
		br.close();
		return result;
	}
	public String[] questionRead(String today) throws IOException {
		File file = new File("D://home/temp/onepercent/main/question/"+today+"question.txt");

		BufferedReader br = new BufferedReader(new InputStreamReader(
				new FileInputStream(file), "utf-8"));
        String data[] = new String[6];
        int cnt = 0;
        while ((data[cnt] = br.readLine()) != null){
        	cnt++;
        }
		br.close();
		return data;
	}
	public String winnerRead(String today) throws IOException {
		String result = "";
		String test = "";
		File file = new File("D://home/temp/onepercent/main/winner/"+today+"winner.txt");
		BufferedReader br = new BufferedReader(new InputStreamReader(
				new FileInputStream(file), "utf-8"));
		while ((test = br.readLine()) != null){
			result += test;
		}
		br.close();
		return result;
	}
}

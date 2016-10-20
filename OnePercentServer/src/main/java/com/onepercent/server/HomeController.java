package com.onepercent.server;

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

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "home.do", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);

		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);

		model.addAttribute("serverTime", formattedDate);

		return "home";
	}

	@RequestMapping(value = "calendar.do", method = RequestMethod.GET)
	public String calendar(Locale locale, Model model) {

		return "calendar";
	}
	@RequestMapping(value = "timer.do", method = RequestMethod.GET)
	public String timer(Locale locale, Model model) {

		return "timer";
	}
	// main data
	@RequestMapping(value = "/main.do")
	public ModelAndView main(HttpServletRequest request) throws Exception {
		ModelAndView mv = new ModelAndView("jsonView");
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		Map<String, Object> map = new HashMap<String, Object>();
		Date date = new Date();
		String today = 1900+date.getYear()+"" + (date.getMonth()+1)+""+date.getDate();
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
		map.put("gift", gift_str);
		map.put("question", question_str[0]);
		map.put("example", example_list);
		map.put("winner", winner_str);
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
		File file = new File("C://onepercent/main/gift/"+today+"gift.txt");
		BufferedReader br = new BufferedReader(new InputStreamReader(
				new FileInputStream(file), "utf-8"));
		while ((test = br.readLine()) != null){
			result += test;
		}
		br.close();
		return result;
	}
	public String[] questionRead(String today) throws IOException {
		File file = new File("C://onepercent/main/question/"+today+"question.txt");

		BufferedReader br = new BufferedReader(new InputStreamReader(
				new FileInputStream(file), "utf-8"));
        String data[] = new String[6];
        int cnt = 0;
        // readLine 사용해 한 라인씩 읽어들인다
        while ((data[cnt] = br.readLine()) != null){
        	cnt++;
        }
		br.close();
		return data;
	}
	public String winnerRead(String today) throws IOException {
		String result = "";
		String test = "";
		File file = new File("C://onepercent/main/winner/"+today+"winner.txt");
		BufferedReader br = new BufferedReader(new InputStreamReader(
				new FileInputStream(file), "utf-8"));
		while ((test = br.readLine()) != null){
			result += test;
		}
		br.close();
		return result;
	}
}

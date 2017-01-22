package com.onepercent.server.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.onepercent.server.service.UserService;

@Controller
public class UserController {
	@Resource(name = "UserService")
	private UserService service;
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	// user list display
	@RequestMapping(value = "/userList.do", method= RequestMethod.GET)
	public ModelAndView userList(Map<String, Object> commandMap) throws Exception {
		ModelAndView mv = new ModelAndView("userTable");
		List<Map<String, Object>> list = service.selectUserList(commandMap);
		mv.addObject("user_list", list);
		return mv;
	}
	// login check
	@RequestMapping(value = "/login.do", method = RequestMethod.GET)
	public ModelAndView loginCheck(HttpServletRequest request) throws Exception {
		String user_id = request.getParameter("user_id");
		String user_password = request.getParameter("user_password");
		System.out.println("user_id : " + user_id + " pwd : " + user_password);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("user_id", user_id);
		String check_password = service.selectUserPassword(map);
		ModelAndView mv = new ModelAndView("jsonView");
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		Map<String, Object> list_map = new HashMap<String, Object>();
		if (user_password.equals(check_password)) {
			list_map.put("state", "success");

		} else {
			list_map.put("state", "fail");
		}
		list.add(list_map);
		mv.addObject("login_result", list);
		return mv;
	}
	
	// user insert
	@RequestMapping(value = "/insertUser.do", method = RequestMethod.POST)
	public ModelAndView userInsert(@RequestBody Map<String,String> request) throws Exception {
		
		Map<String, Object> map = new HashMap<String, Object>();
		String user_id = request.get("user_id");
		String user_password = request.get("user_password");
		String sign_date = request.get("sign_date");
		String user_token = request.get("user_token");
		logger.info("id : " + user_id + " date : " + sign_date + " password : " + user_password + " user_token : " + user_token);
		System.out.println("id : " + user_id + " date : " + sign_date + " password : " + user_password + " user_token : " + user_token);
		map.put("user_id", user_id);
		map.put("user_password", user_password);
		map.put("user_token", user_token);
		map.put("sign_date", sign_date);
		int signup_state = service.insertUser(map);

		ModelAndView mv = new ModelAndView("jsonView");
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		Map<String, Object> list_map = new HashMap<String, Object>();
		System.out.println(signup_state);
		if (signup_state == 1) {
			list_map.put("state", "success");

		} else {
			list_map.put("state", "fail");
		}
		list.add(list_map);
		mv.addObject("sign_result", list);
		return mv;
	}

	// delete user
	@RequestMapping(value ="/userDelete.do", method = RequestMethod.POST)
	public void userDelete(HttpServletRequest request, Map<String, Object> commandMap) throws Exception {
		Map<String, Object> map = new HashMap<String, Object>();
		String user_id = request.getParameter("user_id");
		System.out.println("user_id : " +user_id);
		map.put("user_id", user_id);
		service.deleteUser(map);
//		ModelAndView mv = new ModelAndView("userList");
//		List<Map<String, Object>> list = service.selectUserList(commandMap);
//		mv.addObject("user_list", list);
//		return mv;
	}
}

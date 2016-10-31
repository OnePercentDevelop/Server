package com.onepercent.server.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.onepercent.server.service.UserService;
@Controller
public class UserController {
	@Resource(name = "UserService")
	private UserService service;
	
	//user list display
	@RequestMapping(value = "/userList.do")
	public ModelAndView userList(Map<String, Object> commandMap) throws Exception {
		ModelAndView mv = new ModelAndView("userList");
		List<Map<String, Object>> list = service.selectUserList(commandMap);
		mv.addObject("user_list", list);
		return mv;
	}
	
	//user insert
	@RequestMapping("/insertUser.do")
	public void userInput(HttpServletRequest request) throws Exception {
		request.setCharacterEncoding("EUC-KR");
		Map<String, Object> map = new HashMap<String, Object>();
		String user_id = request.getParameter("user_id");
		String user_password = request.getParameter("user_password");
		String sign_date = request.getParameter("sign_date");
		String user_token = request.getParameter("user_token");
		
		System.out.println("id : " + user_id + " date : " + sign_date);
		map.put("user_id", user_id);
		map.put("user_password", user_password);
		map.put("user_token", user_token);
		map.put("sign_date", sign_date);
		service.insertUser(map);
	}
	// delete user
		@RequestMapping("/userDelete.do")
		public ModelAndView memberDelete(HttpServletRequest request, Map<String, Object> commandMap) throws Exception {
			Map<String, Object> map = new HashMap<String, Object>();
			String user_id = request.getParameter("user_id");
			map.put("user_id", user_id);
			service.deleteUser(map);
			ModelAndView mv = new ModelAndView("userList");
			List<Map<String, Object>> list = service.selectUserList(commandMap);
			mv.addObject("user_list", list);
			return mv;
		}
}

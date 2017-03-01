package com.onepercent.server.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.onepercent.server.service.VoteService;

@Controller
public class VoteController {
	@Resource(name = "VoteService")
	private VoteService voteService;

	// vote list display
	@RequestMapping(value = "/voteList.do", method = RequestMethod.GET)
	public ModelAndView voteList(Map<String, Object> commandMap) throws Exception {
		ModelAndView mv = new ModelAndView("voteTable");
		List<Map<String, Object>> list = voteService.selectVoteList(commandMap);
		mv.addObject("vote_list", list);
		return mv;
	}

	// 질문지 만들기 display
	@RequestMapping(value = "/questionFormDisplay.do", method = RequestMethod.GET)
	public ModelAndView questionFormDisplay(Map<String, Object> commandMap) throws Exception {
		ModelAndView mv = new ModelAndView("questionForm");
		return mv;
	}

	// 사용자 투표 내역 가져오기
	@RequestMapping(value = "/userVoteList.do", method = RequestMethod.GET)
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
	@RequestMapping(value = "/voteNumber.do", method = RequestMethod.GET)
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
	@RequestMapping(value = "/insertVote.do", method = RequestMethod.POST)
	public ModelAndView voteInser(@RequestBody Map<String, String> request) throws Exception {
		Map<String, Object> map = new HashMap<String, Object>();
		String user_id = request.get("user_id");
		String vote_date = request.get("vote_date");
		System.out.println("vote_date : " + vote_date);
		System.out.println("user_id : " + user_id);
		int vote_answer = Integer.parseInt(request.get("vote_answer"));

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
	@RequestMapping(value = "/voteDelete.do", method = RequestMethod.POST)
	public void voteDelete(HttpServletRequest request, Map<String, Object> commandMap) throws Exception {
		Map<String, Object> map = new HashMap<String, Object>();
		int vote_id = Integer.parseInt(request.getParameter("vote_id"));
		System.out.println("vote_id: " + vote_id);
		map.put("vote_id", vote_id);
		voteService.deleteVote(map);
		// ModelAndView mv = new ModelAndView("voteList");
		// List<Map<String, Object>> list =
		// voteService.selectVoteList(commandMap);
		// mv.addObject("vote_list", list);
		// return mv;
	}

	// 투표 리스트 보여주기
	@RequestMapping(value = "/questionList.do", method = RequestMethod.GET)
	public ModelAndView getQuestionList(HttpServletRequest request) throws Exception {
		ModelAndView mv = new ModelAndView("questionList");
		List<LinkedHashMap<String, Object>> list = voteService.selectQuestionList();
		mv.addObject("question_list", list);
		return mv;
	}
	
	// 질문지 삭제하기
	@RequestMapping(value = "/deleteQuestion.do", method = RequestMethod.POST)
	public void deleteQuestion(HttpServletRequest request) throws Exception {
		Map<String, Object> map = new HashMap<String, Object>();
		String vote_date= request.getParameter("vote_date");
		map.put("vote_date", vote_date);
		voteService.deleteQuestion(map);
	}
	
	// 투표 결과 모두 가져오기
	@RequestMapping(value = "/voteResult.do", method = RequestMethod.GET)
	public ModelAndView getVoteResult(HttpServletRequest request) throws Exception {
		ModelAndView mv = new ModelAndView("jsonView");
		List<LinkedHashMap<String, Object>> list = voteService.selectVoteResult();
		mv.addObject("voteTotalResult", list);
		return mv;
	}

	// 해당 날짜 이후의 투표 결과 가져오기
	@RequestMapping(value = "/voteResultSince.do", method = RequestMethod.GET)
	public ModelAndView getVoteResultSince(HttpServletRequest request) throws Exception {
		Map<String, Object> map = new HashMap<String, Object>();
		String vote_date = request.getParameter("vote_date");
		map.put("vote_date", vote_date);
		ModelAndView mv = new ModelAndView("jsonView");
		List<LinkedHashMap<String, Object>> list = voteService.selectVoteResultSince(map);
		mv.addObject("voteResultSince", list);
		return mv;
	}

	// 오늘 날짜에 맞는 투표 가져오기
	@RequestMapping(value = "/todayQuestion.do", method = RequestMethod.GET)
	public ModelAndView getTodayQuestion(HttpServletRequest request) throws Exception {
		ModelAndView mv = new ModelAndView("jsonView");
		String vote_date = request.getParameter("vote_date");
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("vote_date", vote_date);
		List<LinkedHashMap<String, Object>> list = voteService.selectTodayQuestion(map);
		mv.addObject("todayQuestion", list);
		return mv;
	}

	// 질문지 insert
	@RequestMapping(value = "/insertQuestion.do")
	public ModelAndView insertQuestion(HttpServletRequest request) throws Exception {
		ModelAndView mv = new ModelAndView("jsonView");
		request.setCharacterEncoding("utf-8");
		String vote_date = request.getParameter("vote_date");
		String vote_question = request.getParameter("vote_question");
		String ex1_value = request.getParameter("ex1_value");
		String ex2_value = request.getParameter("ex2_value");
		String ex3_value = request.getParameter("ex3_value");
		String ex4_value = request.getParameter("ex4_value");
		System.out.println("vote_date : " + vote_date);
		System.out.println(vote_question + " / " + ex1_value + ", " + ex2_value + ", " + ex3_value + ", " + ex4_value);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("vote_date", vote_date);
		map.put("vote_question", vote_question);
		map.put("ex1_value", ex1_value);
		map.put("ex2_value", ex2_value);
		map.put("ex3_value", ex3_value);
		map.put("ex4_value", ex4_value);
		int question_state = voteService.insertQuestion(map);
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		map.clear();
		if (question_state == 1) {
			map.put("state", "success");
		} else {
			map.put("state", "fail");
		}
		mv.addObject("input_result", map);
		return mv;
	}

	// 해당 질문에 결과 update
	@RequestMapping(value = "/updateQuestionResult.do")
	public ModelAndView updateQuestionResult(HttpServletRequest request) throws Exception {
		ModelAndView mv = new ModelAndView("jsonView");
		String vote_date = request.getParameter("vote_date");
		// vote_date형식이 제대로 왔는지 검사 필요.

		int ex1_count = Integer.parseInt(request.getParameter("ex1_count"));
		int ex2_count = Integer.parseInt(request.getParameter("ex2_count"));
		int ex3_count = Integer.parseInt(request.getParameter("ex3_count"));
		int ex4_count = Integer.parseInt(request.getParameter("ex4_count"));
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("vote_date", vote_date);
		map.put("ex1_count", ex1_count);
		map.put("ex2_count", ex2_count);
		map.put("ex3_count", ex3_count);
		map.put("ex4_count", ex4_count);
		voteService.updateQuestionResult(map);
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		Map<String, Object> return_map = new HashMap<String, Object>();
		return_map.put("state", "success");
		list.add(return_map);
		mv.addObject("update_state", list);
		return mv;
	}

}

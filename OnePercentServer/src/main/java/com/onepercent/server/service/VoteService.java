package com.onepercent.server.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.onepercent.server.dao.VoteDao;

@Service("VoteService")
public class VoteService {
	@Resource(name = "VoteDao")
	private VoteDao voteDao;

	public Object good() {
		// TODO Auto-generated method stub
		return "vote";
	}

	// vote 전체 출력
	public List<Map<String, Object>> selectVoteList(Map<String, Object> Map) throws Exception {
		return voteDao.selectVoteList(Map);
	}
	// 투표 결과 모두 가져오기
	public List<Map<String, Object>> selectVoteResult() throws Exception {
		return voteDao.selectVoteResult();
	}
	// 해당 날짜 이후로 투표 결과 가져오기
	public List<Map<String, Object>> selectVoteResultSince(Map<String, Object> Map) throws Exception {
		return voteDao.selectVoteResultSince(Map);
	}
	// user 투표 내역 가져오기
	public List<Map<String, Object>> selectUserVoteList(Map<String, Object> Map) throws Exception {
		return voteDao.selectUserVoteList(Map);
	}

	// 현재 투표자 수 가져오기
	public List<Map<String, Object>> selectVoteNumber(Map<String, Object> Map) throws Exception {
		return voteDao.selectVoteNumber(Map);
	}

	// vote 한개 delete
	public void deleteVote(Map<String, Object> map) {
		voteDao.deleteVote(map);
	}

	// vote 한개 insert
	public int insertVote(Map<String, Object> map) {
		return voteDao.insertVote(map);
	}
	
	public Map<String, Object> todayQuestion() throws IOException {
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
		return map;
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

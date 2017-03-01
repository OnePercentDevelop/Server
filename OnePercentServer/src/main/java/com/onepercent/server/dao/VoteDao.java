package com.onepercent.server.dao;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.onepercent.server.abst.dao.abDAO;

@SuppressWarnings("unchecked")
@Repository("VoteDao")
public class VoteDao extends abDAO{
	//투표 리스트 가져오기
	public List<Map<String, Object>> selectVoteList(Map<String, Object> commandMap) {
		return (List<Map<String,Object>>)selectList("voteSQL.selectVoteList", commandMap);
	}
	public List<Map<String, Object>> selectUserVoteList(Map<String, Object> commandMap) {
		return (List<Map<String,Object>>)selectList("voteSQL.selectUserVoteList", commandMap);
	}
	public List<Map<String, Object>> selectVoteNumber(Map<String, Object> commandMap) {
		return (List<Map<String,Object>>)selectList("voteSQL.selectVoteNumber", commandMap);
	}
	public List<LinkedHashMap<String, Object>> selectVoteResult() {
		return (List<LinkedHashMap<String,Object>>)selectList("voteSQL.selectVoteResult");
	}
	public List<LinkedHashMap<String, Object>> selectQuestionList() {
		return (List<LinkedHashMap<String,Object>>)selectList("voteSQL.selectQuestionList");
	}
	public List<LinkedHashMap<String, Object>> selectVoteResultSince(Map<String, Object> commandMap) {
		return (List<LinkedHashMap<String,Object>>)selectList("voteSQL.selectVoteResultSince", commandMap);
	}
	public List<LinkedHashMap<String, Object>> selectTodayQuestion(Map<String, Object> commandMap) {
		System.out.println("view : " + commandMap.get("vote_date"));
		return (List<LinkedHashMap<String,Object>>)selectList("voteSQL.selectTodayQuestion", commandMap);
	}	
	public void deleteVote(Map<String, Object> map) {
		delete("voteSQL.deleteVote",map);
	}
	public void deleteQuestion(Map<String, Object> map) {
		delete("voteSQL.deleteQuestion",map);
	}
	public int insertVote(Map<String, Object> map) {
		return (Integer)insert("voteSQL.insertVote", map);
	}
	public int insertQuestion(Map<String, Object> map) {
		return (Integer)insert("voteSQL.insertQuestion", map);
	}
	public void updateQuestionResult(Map<String, Object> map) {
		update("voteSQL.updateQuestionResult", map);
	}
}

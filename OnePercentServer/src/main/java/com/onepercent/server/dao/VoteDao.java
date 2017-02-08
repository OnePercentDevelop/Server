package com.onepercent.server.dao;

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
	public List<Map<String, Object>> selectVoteResult() {
		return (List<Map<String,Object>>)selectList("voteSQL.selectVoteResult");
	}
	public List<Map<String, Object>> selectVoteResultSince(Map<String, Object> commandMap) {
		return (List<Map<String,Object>>)selectList("voteSQL.selectVoteResultSince", commandMap);
	}
	public void deleteVote(Map<String, Object> map) {
		delete("voteSQL.deleteVote",map);
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

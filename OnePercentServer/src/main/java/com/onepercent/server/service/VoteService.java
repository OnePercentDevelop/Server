package com.onepercent.server.service;

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
}

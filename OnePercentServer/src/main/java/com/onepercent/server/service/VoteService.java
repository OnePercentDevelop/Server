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

	// vote ��ü ���
	public List<Map<String, Object>> selectVoteList(Map<String, Object> Map) throws Exception {
		return voteDao.selectVoteList(Map);
	}

	// user ��ǥ ���� ��������
	public List<Map<String, Object>> selectUserVoteList(Map<String, Object> Map) throws Exception {
		return voteDao.selectUserVoteList(Map);
	}

	// ���� ��ǥ�� �� ��������
	public List<Map<String, Object>> selectVoteNumber(Map<String, Object> Map) throws Exception {
		return voteDao.selectVoteNumber(Map);
	}

	// vote �Ѱ� delete
	public void deleteVote(Map<String, Object> map) {
		voteDao.deleteVote(map);
	}

	// vote �Ѱ� insert
	public int insertVote(Map<String, Object> map) {
		return voteDao.insertVote(map);
	}
}

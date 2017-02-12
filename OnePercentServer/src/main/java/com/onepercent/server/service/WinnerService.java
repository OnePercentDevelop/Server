package com.onepercent.server.service;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.onepercent.server.dao.WinnerDao;

@Service("WinnerService")
public class WinnerService {
	@Resource(name = "WinnerDao")
	private WinnerDao winnerDao;

	public Object good() {
		// TODO Auto-generated method stub
		return "winner";
	}
	
	// ��÷�� ��� ��������
	public List<LinkedHashMap<String, Object>> selectWinnerAll() throws Exception {
		return winnerDao.selectWinnerAll();
	}
	// Ư�� ��¥���� ��÷�� ��� ��������
	public List<LinkedHashMap<String, Object>> selectWinnerSince(Map<String, Object> Map) throws Exception {
		return winnerDao.selectWinnerSince(Map);
	}
	// ������ ��ǰ��, ��ǰ �̹��� ��������
	public List<LinkedHashMap<String, Object>> selectTodayGift(Map<String, Object> Map) throws Exception {
		return winnerDao.selectTodayGift(Map);
	}
}

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
	
	// 당첨자 모두 가져오기
	public List<LinkedHashMap<String, Object>> selectWinnerAll() throws Exception {
		return winnerDao.selectWinnerAll();
	}
	// 특정 날짜부터 당첨자 모두 가져오기
	public List<LinkedHashMap<String, Object>> selectWinnerSince(Map<String, Object> Map) throws Exception {
		return winnerDao.selectWinnerSince(Map);
	}
	// 오늘의 상품명, 상품 이미지 가져오기
	public List<LinkedHashMap<String, Object>> selectTodayGift(Map<String, Object> Map) throws Exception {
		return winnerDao.selectTodayGift(Map);
	}
}

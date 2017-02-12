package com.onepercent.server.service;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.onepercent.server.dao.HomeDao;

@Service("HomeService")
public class HomeService {
	@Resource(name = "HomeDao")
	private HomeDao homeDao;
	
	// 오늘의 상품명, 상품이미지 url 가져오기
	public List<LinkedHashMap<String, Object>> selectTodayGift(Map<String, Object> Map) throws Exception {
		return homeDao.selectTodayGift(Map);
	}
}

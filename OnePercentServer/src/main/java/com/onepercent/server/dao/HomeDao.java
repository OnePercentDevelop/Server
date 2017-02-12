package com.onepercent.server.dao;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.onepercent.server.abst.dao.abDAO;

@SuppressWarnings("unchecked")
@Repository("HomeDao")
public class HomeDao extends abDAO{
	
	// 오늘의 상품명, 상품이미지 url 가져오기
	public List<LinkedHashMap<String, Object>> selectTodayGift(Map<String, Object> commandMap) {
		return (List<LinkedHashMap<String,Object>>)selectList("winnerSQL.selectTodayGift", commandMap);
	}
}

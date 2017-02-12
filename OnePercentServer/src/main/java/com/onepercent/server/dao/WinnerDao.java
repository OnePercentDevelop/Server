package com.onepercent.server.dao;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.onepercent.server.abst.dao.abDAO;

@SuppressWarnings("unchecked")
@Repository("WinnerDao")
public class WinnerDao extends abDAO{
	public List<LinkedHashMap<String, Object>> selectWinnerAll() {
		return (List<LinkedHashMap<String,Object>>)selectList("winnerSQL.selectWinnerAll");
	}
	public List<LinkedHashMap<String, Object>> selectWinnerSince(Map<String, Object> commandMap) {
		return (List<LinkedHashMap<String,Object>>)selectList("winnerSQL.selectWinnerSince", commandMap);
	}
	public List<LinkedHashMap<String, Object>> selectTodayGift(Map<String, Object> commandMap) {
		return (List<LinkedHashMap<String,Object>>)selectList("winnerSQL.selectTodayGift", commandMap);
	}
}

package com.onepercent.server.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.onepercent.server.abst.dao.abDAO;

@SuppressWarnings("unchecked")
@Repository("UserDao")
public class UserDao extends abDAO{
	
	// login check 
	public String selectUserPassword(Map<String, Object> commandMap) {
		return (String)selectOne("sample.selectUserPassword", commandMap);
	}
	
	public List<Map<String, Object>> selectUserList(Map<String, Object> commandMap) {
		return (List<Map<String,Object>>)selectList("sample.selectUserList", commandMap);
	}
	public int insertUser(Map<String, Object> map) {
		return (Integer)insert("sample.insertUser", map);
	}
	public void deleteUser(Map<String, Object> map) {
		delete("sample.deleteUser",map);
	}
}

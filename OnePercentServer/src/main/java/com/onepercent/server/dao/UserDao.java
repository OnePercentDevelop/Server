package com.onepercent.server.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.onepercent.server.abst.dao.abDAO;

@SuppressWarnings("unchecked")
@Repository("UserDao")
public class UserDao extends abDAO{
	public List<Map<String, Object>> selectUserList(Map<String, Object> commandMap) {
		return (List<Map<String,Object>>)selectList("sample.selectUserList", commandMap);
	}
	public void insertUser(Map<String, Object> map) {
		insert("sample.insertUser", map);
	}
	public void deleteUser(Map<String, Object> map) {
		delete("sample.deleteUser",map);
	}
}

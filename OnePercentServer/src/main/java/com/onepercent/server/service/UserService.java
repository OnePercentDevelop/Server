package com.onepercent.server.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.onepercent.server.dao.UserDao;

@Service("UserService")
public class UserService {

	@Resource(name = "UserDao")
	private UserDao dao;

	public Object good() {
		// TODO Auto-generated method stub
		return "onepercent";
	}
	
	//id에 해당하는 password가져오기
	public String selectUserPassword(Map<String, Object> commandMap) throws Exception {
		return dao.selectUserPassword(commandMap);
	}
	// user 전체 출력
	public List<Map<String, Object>> selectUserList(Map<String, Object> Map) throws Exception {
		return dao.selectUserList(Map);
	}

	// user 한명 insert
	public int insertUser(Map<String, Object> map) {
		return dao.insertUser(map);
	}

	// user 한명 delete
	public void deleteUser(Map<String, Object> map) {
		dao.deleteUser(map);
	}
}

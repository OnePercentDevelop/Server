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
	
	//id�� �ش��ϴ� password��������
	public String selectUserPassword(Map<String, Object> commandMap) throws Exception {
		return dao.selectUserPassword(commandMap);
	}
	// user ��ü ���
	public List<Map<String, Object>> selectUserList(Map<String, Object> Map) throws Exception {
		return dao.selectUserList(Map);
	}

	// user �Ѹ� insert
	public int insertUser(Map<String, Object> map) {
		return dao.insertUser(map);
	}

	// user �Ѹ� delete
	public void deleteUser(Map<String, Object> map) {
		dao.deleteUser(map);
	}
}

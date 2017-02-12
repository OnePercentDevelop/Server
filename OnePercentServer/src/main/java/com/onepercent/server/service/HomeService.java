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
	
	// ������ ��ǰ��, ��ǰ�̹��� url ��������
	public List<LinkedHashMap<String, Object>> selectTodayGift(Map<String, Object> Map) throws Exception {
		return homeDao.selectTodayGift(Map);
	}
}

package cn.com.start.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.mapper.InformationMapper;
import cn.com.model.Information;
import cn.com.start.service.interfaces.InformationService;

@Service
public class InformationServiceImpl implements InformationService {
	@Autowired
	public InformationMapper informationMapper;
	public int insert(Information record) {
		int result=informationMapper.insert(record);
		return result;
	}
	
}

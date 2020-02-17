package com.wangxinyu.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wangxinyu.dao.SlideMapper;
import com.wangxinyu.domain.Slide;
import com.wangxinyu.service.SlideService;

@Service
public class SlideServiceImpl implements SlideService {
	@Resource
	private SlideMapper slideMapper; 

	@Override
	public List<Slide> selects() {
		// TODO Auto-generated method stub
		return slideMapper.selects();
	}

}

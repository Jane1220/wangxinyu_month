package com.wangxinyu.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wangxinyu.dao.ChannelMapper;
import com.wangxinyu.domain.Category;
import com.wangxinyu.domain.Channel;
import com.wangxinyu.service.ChannelService;

@Service
public class ChannelServiceImpl implements ChannelService {
@Resource
private ChannelMapper channelMapper;
	@Override
	public List<Channel> selects() {
		
		return channelMapper.selects();
	}

	@Override
	public List<Category> selectsByCid(Integer channelId) {
		return channelMapper.selectsByCid(channelId);
	}

}

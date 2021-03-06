package com.wangxinyu.service.impl;

import static org.junit.Assert.*;

import java.util.Date;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.wangxinyu.domain.Collect;
import com.wangxinyu.domain.User;
import com.wangxinyu.service.CollectService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-beans.xml")
public class CollectServiceImplTest {
	@Resource
	CollectService collectService;

	@Test
	public void testInsert() {
		Collect collect = new Collect();
		collect.setText("test收集2");
		  User user = new User();
		  user.setId(217);
		  
		collect.setUser(user);
		
		//collect.setUrl("https://www.baidu.com");
		collect.setUrl("abc");
		collect.setCreated(new Date());
		collectService.insert(collect);
	}

}

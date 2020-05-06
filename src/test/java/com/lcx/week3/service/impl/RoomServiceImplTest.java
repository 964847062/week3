package com.lcx.week3.service.impl;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lcx.common.utils.DateUtil;
import com.lcx.common.utils.RandomUtil;
import com.lcx.common.utils.StringUtil;
import com.lcx.week3.domain.Room;
import com.lcx.week3.service.RoomService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-beans.xml")
public class RoomServiceImplTest {
	
	@Resource
	private RoomService roomService;
	@Test
	public void test() {
		List<Room> list = new ArrayList<Room>();
		for(int i=0;i<=100;i++) {
			Room r = new Room();
			Calendar calendar = Calendar.getInstance();
			calendar.set(2020, 4, 1);
			r.setDate(DateUtil.random(calendar.getTime(), new Date()));
			r.setName(StringUtil.generateChineseName());
			r.setPhone(RandomUtil.randomNumber(11));
			r.setBeizhu(StringUtil.randomChineseString());
			r.setId(RandomUtil.random(1, 3));
			list.add(r);
		}
		for (Room room : list) {
			System.out.println(list);
		}
	}

}

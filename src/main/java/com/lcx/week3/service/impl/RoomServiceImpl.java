package com.lcx.week3.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lcx.week3.dao.RoomMapper;
import com.lcx.week3.domain.Room;
import com.lcx.week3.service.RoomService;
import com.lcx.week3.vo.RoomVo;

@Service
public class RoomServiceImpl implements RoomService {

	@Resource
	private RoomMapper roomMapper;

	@Override
	public PageInfo<Room> selects(RoomVo roomVo, Integer pageNum, Integer pageSize) {
		
		PageHelper.startPage(pageNum, pageSize);
		List<Room> list = roomMapper.selects(roomVo);
		
		return new PageInfo<Room>(list);
	}

	@Override
	public int insetBatch(List<Room> list) {
		// TODO Auto-generated method stub
		return roomMapper.insetBatch(list);
	}
}

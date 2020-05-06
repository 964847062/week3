package com.lcx.week3.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.lcx.week3.domain.Room;
import com.lcx.week3.vo.RoomVo;

public interface RoomService {

	/**
	 * 
	 * @Title: selects 
	 * @Description: \查询
	 * @param roomVo
	 * @return
	 * @return: List<Room>
	 */
	PageInfo<Room> selects(RoomVo roomVo,Integer pageNum,Integer pageSize);
	
	/**
	 * 
	 * @Title: insetBatch 
	 * @Description: 批量增加
	 * @param list
	 * @return
	 * @return: int
	 */
	int insetBatch(List<Room> list);
}

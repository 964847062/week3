package com.lcx.week3.dao;

import java.util.List;

import com.lcx.week3.domain.Room;
import com.lcx.week3.vo.RoomVo;

public interface RoomMapper {
	
	/**
	 * 
	 * @Title: selects 
	 * @Description: \��ѯ
	 * @param roomVo
	 * @return
	 * @return: List<Room>
	 */
	List<Room> selects(RoomVo roomVo);
	
	/**
	 * 
	 * @Title: insetBatch 
	 * @Description: ��������
	 * @param list
	 * @return
	 * @return: int
	 */
	int insetBatch(List<Room> list);
}

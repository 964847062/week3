package com.lcx.week3.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageInfo;
import com.lcx.week3.domain.Room;
import com.lcx.week3.service.RoomService;
import com.lcx.week3.vo.RoomVo;

@Controller
public class RoomController {

	@Resource
	private RoomService roomService;
	
	public String room(Model model,RoomVo roomVo,@RequestParam(defaultValue = "1")Integer pageNum,@RequestParam(defaultValue = "5")Integer pageSize) {
		PageInfo<Room> info = roomService.selects(roomVo, pageNum, pageSize);
		model.addAttribute("info", info);
		model.addAttribute("roomVo", roomVo);
		return "room";
		
	}
}

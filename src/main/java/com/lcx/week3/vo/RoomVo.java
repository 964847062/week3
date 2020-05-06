package com.lcx.week3.vo;

import java.math.BigDecimal;
import java.util.Date;

public class RoomVo {
	
	private String name;
	
	private String phone;
	
	private String type;
	
	private BigDecimal p1;
	private BigDecimal p2;
	
	private Date d1;
	
	private Date d2;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public BigDecimal getP1() {
		return p1;
	}

	public void setP1(BigDecimal p1) {
		this.p1 = p1;
	}

	public BigDecimal getP2() {
		return p2;
	}

	public void setP2(BigDecimal p2) {
		this.p2 = p2;
	}

	public Date getD1() {
		return d1;
	}

	public void setD1(Date d1) {
		this.d1 = d1;
	}

	public Date getD2() {
		return d2;
	}

	public void setD2(Date d2) {
		this.d2 = d2;
	}

	
	
}

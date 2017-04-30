package com.dto;

import java.util.Date;

public class Diary {
	private Integer rowId;
	private String title;
	private String content;
	
	private Date creatDate;
	private Integer userId;
	private String validFlag;
	private String creatDateS;
	private String simpleContent;//正文简写
	private String time;//时：分
	private String month;//月份
	private String day;//日期
	public Integer getRowId() {
		return rowId;
	}
	public void setRowId(Integer rowId) {
		this.rowId = rowId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getCreatDate() {
		return creatDate;
	}
	public void setCreatDate(Date creatDate) {
		this.creatDate = creatDate;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getValidFlag() {
		return validFlag;
	}
	public void setValidFlag(String validFlag) {
		this.validFlag = validFlag;
	}
	public String getCreatDateS() {
		return creatDateS;
	}
	public void setCreatDateS(String creatDateS) {
		this.creatDateS = creatDateS;
	}
	public String getSimpleContent() {
		return simpleContent;
	}
	public void setSimpleContent(String simpleContent) {
		this.simpleContent = simpleContent;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	
}

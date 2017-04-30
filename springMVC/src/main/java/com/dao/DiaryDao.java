package com.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.dto.Diary;

@Repository
public interface DiaryDao {
	public List<Diary> selectByPrimaryKey();
}

package com.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.DiaryDao;
import com.dto.Diary;
import com.service.DiaryService;

@Service
public class DiaryServiceImpl implements DiaryService {
	@Autowired
	private DiaryDao diaryDao;
	
	public List<Diary> getAllDiary() {
		return diaryDao.selectByPrimaryKey();
	}
 
}

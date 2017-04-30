package com.controller;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.dto.Diary;
import com.service.DiaryService;

@Controller
public class TestController {
	@Autowired
	private DiaryService diaryService;
	
	@RequestMapping("index")
	public String index(Model model){
		List<Diary> result = diaryService.getAllDiary();
		model.addAttribute("result", result);
		return "diary";
	}
	@RequestMapping("getAllDiary")
	public String getAllDiary(Model model){
		List<Diary> result = diaryService.getAllDiary();
		model.addAttribute("result", result);
		return "diary";
	}
}

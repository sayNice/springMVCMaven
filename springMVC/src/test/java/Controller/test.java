package Controller;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.dto.Diary;
import com.service.DiaryService;

@ContextConfiguration(locations={"classpath:applicationContext_test.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class test {
	@Autowired
	private DiaryService diaryService;
	
	@Test
	public void getDiary(){
		List<Diary> result = diaryService.getAllDiary();
		for (Diary diary : result) {
			System.out.println(diary.getTitle());
		}
		
	}
}

package com.kh.spring16;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kh.spring16.entity.MusicDto;

@SpringBootTest
public class MusicDetailTest {

	@Autowired
	private SqlSession sqlSession;
	
	@Test
	public void test() {
		int musicNo=10000;
		MusicDto musicDto = sqlSession.selectOne("music.one",musicNo);
		System.out.println(musicDto);
	}
}

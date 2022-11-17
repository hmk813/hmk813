package com.kh.spring15;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kh.spring15.entity.GuestBookDto;

@SpringBootTest
public class GuestBookInsertTest {
	
	@Autowired
	private SqlSession sqlSession;
	
	@Test
	public void test() {
		//assertNotNull(sqlSession);
		
		sqlSession.insert("guestbook.insert", GuestBookDto.builder()
																		.name("테스트유저")
																		.memo("하이")
																	.build());
	}
	
}



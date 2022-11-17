package com.kh.spring16;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.sql.Date;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kh.spring16.entity.MusicDto;

@SpringBootTest
public class MusicInsertTest {
	
	@Autowired
	private SqlSession sqlSession;
	
	@Test
	public void test() {
		//assertNotNull(sqlSession);
		MusicDto musicDto = MusicDto.builder()
						.musicTitle("테스트제목")
						.musicArtist("테스트가수")
						.musicAlbum("테스트앨범")
						.releaseTime(Date.valueOf("2022-11-07"))
					.build();
		sqlSession.insert("music.insert", musicDto);
	}

}



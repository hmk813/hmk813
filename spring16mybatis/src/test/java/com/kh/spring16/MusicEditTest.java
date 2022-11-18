package com.kh.spring16;

import java.sql.Date;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kh.spring16.entity.MusicDto;

@SpringBootTest
public class MusicEditTest {

	@Autowired
	private SqlSession sqlSession;
	
	@Test
	public void test() {
		MusicDto musicDto = MusicDto.builder()
										.musicNo(3)
										.musicTitle("바꾼제목")
										.musicArtist("바꾼가수")
										.musicAlbum("바꾼앨범")
										.releaseTime(Date.valueOf("2022-11-19"))
									.build();
		int count = sqlSession.update("music.edit", musicDto);
		if(count>0) {
			System.out.println("변경 성공");
		}
		else {
			System.out.println("대상이 없습니다");
		}
	}
}

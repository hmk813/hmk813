package com.kh.spring16.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kh.spring16.entity.MusicDto;

@Repository
public class MusicDaoImpl implements MusicDao{

	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public void insert(MusicDto musicDto) {
		sqlSession.insert("music.insert",musicDto);
		
	}

	@Override
	public List<MusicDto> list() {
		return sqlSession.selectList("music.list");
	}

	@Override
	public MusicDto selectOne(int musicNo) {
		return sqlSession.selectOne("music.one", musicNo);
	}
	
	@Override
	public boolean edit(MusicDto musicDto) {
	int count = sqlSession.update("music.edit",musicDto);
	return count > 0;
	}
	@Override
	public boolean delete(int musicNo) {
		int count = sqlSession.delete("music.delete",musicNo);
		return count > 0;
	}
}

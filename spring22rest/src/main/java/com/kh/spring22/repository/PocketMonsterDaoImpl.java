package com.kh.spring22.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kh.spring22.entity.PocketMonsterDto;

@Repository
public class PocketMonsterDaoImpl implements PocketMonsterDao {

	@Autowired
	private SqlSession sqlSession;

	@Override
	public List<PocketMonsterDto> list() {
		return sqlSession.selectList("pocketmon.list");
	}

	@Override
	public void insert(PocketMonsterDto dto) {
		sqlSession.insert("pocketmon.insert", dto);
		
	}
}

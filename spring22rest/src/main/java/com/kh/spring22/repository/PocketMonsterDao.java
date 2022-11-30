package com.kh.spring22.repository;

import java.util.List;

import com.kh.spring22.entity.PocketMonsterDto;

public interface PocketMonsterDao {

	List<PocketMonsterDto> list();
	void insert(PocketMonsterDto dto);

}

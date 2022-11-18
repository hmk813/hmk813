package com.kh.spring16.repository;

import java.util.List;

import com.kh.spring16.entity.MusicDto;

public interface MusicDao {
	void insert(MusicDto musicDto);
	List<MusicDto> list();
	MusicDto selectOne(int musicNo);
	boolean edit(MusicDto musicDto);
	boolean delete(int musicNo);
}

package com.kh.spring22.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kh.spring22.entity.PocketMonsterDto;
import com.kh.spring22.repository.PocketMonsterDao;

@RestController
@RequestMapping("/rest")
public class PocketmonController {
	@Autowired
	private PocketMonsterDao dao;
	
	@GetMapping("/pocketmon")
	public List<PocketMonsterDto> list(){
		return dao.list();
	}
	
	@PostMapping("/pocketmon")
	public void insert(@ModelAttribute PocketMonsterDto dto) {
		dao.insert(dto);
	}
	
//	@PutMapping("/pocketmon")
//	@DeleteMapping("/pocketmon")

}

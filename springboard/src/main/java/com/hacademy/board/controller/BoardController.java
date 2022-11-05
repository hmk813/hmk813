package com.hacademy.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.hacademy.board.entity.Board;
import com.hacademy.board.repository.BoardRepository;

@Controller

public class BoardController {

	private static final Board result = null;
	@Autowired
	private BoardRepository boardRepository;
	
	@GetMapping("/")
	public String list(Model model) {
		//model.addAttribute("list",boardRepository.findAll());
		model.addAttribute("list",boardRepository.findAllByOrderByNoDesc());
		return "list";
	}
	
	@GetMapping("/write")
	public String write() {
		return "write";
	}
	
	@PostMapping("/write")
	public String write(@ModelAttribute Board board) {
		Board result = boardRepository.save(board);
		//return "redirect:/";
		return "redirect:detail?no="+result.getNo();
	}
	
	@GetMapping("/detail")
	public String detail(@RequestParam long no, Model model) {
		Board board = boardRepository.findById(no).orElseThrow();
		
		//조회수 증가
		board.setReadcount(board.getReadcount()+1);
		Board result = boardRepository.save(board);
		
		model.addAttribute("board",result);
		return "detail";
	}
		
	@GetMapping("/edit")
	public String edit(@RequestParam long no,Model model) {
		Board board = boardRepository.findById(no).orElseThrow();
		model.addAttribute("board",board);
		return "edit";
	}
	
	@PostMapping("/edit")
	public String edit(@ModelAttribute Board board,RedirectAttributes attr) {
		Board origin = boardRepository.findById(board.getNo()).orElseThrow();
		origin.setTitle(board.getTitle());
		origin.setWriter(board.getWriter());
		origin.setContent(board.getContent());
		Board result = boardRepository.save(origin);
		attr.addAttribute("no",result.getNo());
		return "redirect:detail";
	}
	
	@GetMapping("/delete")
	public String delete(@RequestParam long no, RedirectAttributes attr) {
		boardRepository.deleteById(no);
		return "redirect:/";
	}
	
	//비밀번호 검사 매핑추가
	// -password/모드/번호
	// 모드는 반드시 edit or delete중 하나가 오도록 검사
	
	@GetMapping("")
	
}
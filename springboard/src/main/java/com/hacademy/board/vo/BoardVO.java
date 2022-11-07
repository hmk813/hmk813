package com.hacademy.board.vo;

import com.hacademy.board.util.EmptyChecker;

import lombok.Data;

//검색 처리를 위한 VO
@Data

public class BoardVO {
	private Long no;
	private String writer, title, content, begin, end;
	
	//검색 여부 판정
	public boolean isSearch() {
//		return (no != null && no > 0L) || (writer != null && !writer.isEmpty()) ||
//				(title != null && !title.isEmpty()) || (content != null && !content.isEmpty()) ||
//				(begin != null && !begin.isEmpty()) || (end != null && end.isEmpty());
	
	return !EmptyChecker.isEmpty(no, writer, title, content, begin, end);	
	}
}

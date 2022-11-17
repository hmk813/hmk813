package com.kh.spring15.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class GuestBookDto {

	private int no;
	private String name;
	private String memo;
}

package com.kh.react.vo;

import com.kh.react.entity.MemberDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class MemberLoginVO {
	private MemberDto member;
	private String token;
}

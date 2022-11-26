package com.kh.spring19;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import lombok.extern.slf4j.Slf4j;

//lombok에서 클래스에 @Slf4j 어노테이션  사용시 해당 클래스의 Logger 생성
@Slf4j
@SpringBootTest
public class LoggingTest3 {

	/*
	 로깅 메세지 수준(level)
	 - 메세지의 수준을 구분하여 용도에 맞게 상황에 맞게 사용하는 것을 목표
	 - TRACE -> DEBUG -> INFO -> WARN -> ERROR -> FATAL
	 - TRACE는 추적을 위해 작성하는 상세 메시지
	 - DEBUG는 문제 해결을 위해 작성하는 개발용 메세지
	 - INFO는 사용자에게 정보를 알려주기 위해 작성하는 메세지
	 - WARN은 사용자에게 경고를 하기 위한 메세지
	 - ERROR는 사용자에게 오류를 알려주기 위한 메세지
	 - FATAL은 프로그램이 중단되는 치명적인 문제를 알려주는 메세지
	 
	 */
	
	@Test
	public void test() {
		log.debug("hello logging");
		
		//logger의 좋은점 - holder 지원
		int a = 10;
		int b = 10;
		System.out.println(a + " + " + b + " = " + (a+b));
		log.debug("{} + {} = {}", a, b, a+b);
		
		try {
			int c = 10 / 0; //100% error
		}
		catch(Exception e) {
//			System.err.println("error");
//			e.printStackTrace();
			log.error("error",e);
			
		}
	}
}
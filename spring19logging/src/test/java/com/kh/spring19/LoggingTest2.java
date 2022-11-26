package com.kh.spring19;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class LoggingTest2 {

	private Logger log = LoggerFactory.getLogger(LoggingTest2.class);
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
		for(int i=0; i < 100000; i++) {
			log.debug("hello logging");
		}
	}
}
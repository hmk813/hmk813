package com.kh.spring19;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class LoggingTest1 {

	private Logger log = LoggerFactory.getLogger(LoggingTest1.class); 
	
	@Test
	public void test() {
		log.trace("trace메세지");
		log.debug("debug메세지");
		log.info("info메세지");
		log.warn("warn메세지");
		log.error("error메세지");
	}
}

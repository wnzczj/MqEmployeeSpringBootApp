package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class MySender {

	@Autowired
	JmsTemplate template;
	
	public void sendMessage(String message) {
		template.convertAndSend("myqueue", message);
	}
}

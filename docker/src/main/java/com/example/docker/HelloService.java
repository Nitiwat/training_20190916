package com.example.docker;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
	
	public String getResult() {
		return "pong";
	}
}

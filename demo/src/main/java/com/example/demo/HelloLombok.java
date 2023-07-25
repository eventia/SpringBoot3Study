package com.example.demo;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

// 생성자를 이용 v1.0.2
@RequiredArgsConstructor
@Getter
@Setter
public class HelloLombok {
	
	private final String hello;
	private final int lombok;

	public static void main(String[] args) {
		HelloLombok helloLombok = new HelloLombok("헬로우", 5);
		
		System.out.println(helloLombok.getHello());
		System.out.println(helloLombok.getLombok());
	}

}

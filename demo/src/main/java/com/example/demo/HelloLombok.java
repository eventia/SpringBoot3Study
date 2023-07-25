package com.example.demo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HelloLombok {
	
	private  String hello;
	private  int lombok;
	
/*
	public String getHello() 	{		return hello;	}
	public int getLombok() 		{		return lombok;	}
	public void setHello(String hello) 	{		this.hello = hello;	}
	public void setLombok(int lombok) 	{		this.lombok = lombok;	}
*/
	
	public static void main(String[] args) {
		HelloLombok helloLombok = new HelloLombok();
		helloLombok.setHello("헬로우");
		helloLombok.setLombok(5);
		
		System.out.println(helloLombok.getHello());
		System.out.println(helloLombok.getLombok());
	}

}

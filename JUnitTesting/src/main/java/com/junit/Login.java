package com.junit;

public class Login {
	
	public String login() {
		String s="You are sucessfully loged in.";
		System.out.println(s);
		
		return s;
	}
	
	public  int uploadPost(int a) {
		System.out.println("Post uploded sucessfully...."+a);
		
		return a;
	}
	
	public String logout() {
		String s="You logged out !!!";
		System.out.println(s);
		
		return s;
	}

}

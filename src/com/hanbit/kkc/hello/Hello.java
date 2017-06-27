package com.hanbit.kkc.hello;

import java.util.Scanner; 

public class Hello{

	public static void main(String[] args){
		
		System.out.println("What's your name?\n");
		Scanner scan=new Scanner(System.in);
		String name=scan.next();
		System.out.println("hello!!"+name);	
		
		
	}

}
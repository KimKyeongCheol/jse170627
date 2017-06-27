package com.hanbit.kkc.member;

import java.util.Scanner;
public class Login{
	
	public static final String USER_ID="kim";
    public static final String USER_PASS="1234";
	public static void main(String[] args){
		System.out.print("Login page");
		Scanner scan=new Scanner(System.in);
		
		
		String id="",pw="";
		System.out.print("ID를 입력하세요\n");
		id=scan.next();
		System.out.print("PASSWORD를 입력하세요\n");
		pw=scan.next();
		String check="";
	if(!id.equals(USER_ID)){
		check="ID가 없습니다.";
		
	}else if(!pw.equals(USER_PASS)){
		System.out.print("PASSWORD를 입력하세요\n");
		pw=scan.next();
		check="비밀번호가 틀립니다.";
	}else{
		System.out.print(USER_ID+"님 반갑습니다");
	}
	
		System.out.print(check);
	}
}

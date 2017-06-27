package com.hanbit.kkc.application;

/*
클라이언트에서 프로그램 개발 요청
이름 연봉 입력받고,
연봉 -- 만원을 받으시는 --- 님에게 납부할 세금은 -- 만원입니다.

*/
import java.util.Scanner;
public class TaxCal{
public static void main(String[] args){
	Scanner scan=new Scanner(System.in);
	System.out.print("이름을 입력하세요\n");
	String name=scan.next();
	System.out.print("연봉을 입력하세요\n");
	int money=scan.nextInt();
	double tax=0.097;
	double mon=money*tax;
	System.out.print(money+"원"+name+"님께서 납부할 세금은 "+mon+"원 입니다.");
	
}
}
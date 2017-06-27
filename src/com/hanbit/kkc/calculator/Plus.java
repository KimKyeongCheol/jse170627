package com.hanbit.kkc.calculator;

import java.util.Scanner;


public class Plus{

	public static void main(String[] args){

		Scanner scan=new Scanner(System.in); 
		System.out.println("계산기");
		
		
		

		System.out.println("첫번째 숫자입력");
		int a=scan.nextInt();			
		
		System.out.println("두번째 숫자입력");
		int b=scan.nextInt();
		System.out.println("합계 : "+(a+b));
		System.out.println("곱하기 : "+(a*b));
		System.out.println("빼기 : "+(a-b));


		System.out.println("첫번째 숫자입력");
		double d=scan.nextDouble();			
		
		System.out.println("두번째 숫자입력");
		double e=scan.nextDouble();
		System.out.println("나누기 : "+(a/b));



		


	}
}
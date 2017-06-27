package com.hanbit.kkc.application;
import java.util.Scanner;

public class Bmi{
		public static void main(String[] args){
			
			Scanner scan=new Scanner(System.in);
			System.out.print("나의 체질량지수(BMI)는 ? \n");
			System.out.print("신장을 입력하세요(179m 는 1.79로표시)\n");
			double kidney=scan.nextDouble();
			System.out.print("몸무게를 입력하세요\n");
			double weigh=scan.nextDouble();
			double bmi=weigh/(kidney*kidney);
			System.out.print("bmi 값 : "+bmi);
			String check="";
			if(18.5>=bmi){
				check="저체중";
			}else if(18.5>=bmi){
				check="정상";
			}
			else if(30>=bmi){
				check="과체중";
			}else{
				check="비만";
			}
			
			System.out.print("결과 : "+ check);
			
	}
}

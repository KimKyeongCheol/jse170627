package com.hanbit.kkc.application;

import java.util.Scanner;
public class Time{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		
				
		System.out.print("초를 시간과 분으로 바꾸어주는 프로그램입니다. \n");
		System.out.print("초를 입력하여 주세요\n");
		
		int num=s.nextInt();
		int hours=num/3600;    // 입력한 갑에서 1시간인 3600초를 나누어준다 ( 시 구하는 공식)
		int minute=num%3600/60; // 분을 구하기위해서 입력되고 남은값에서 또 60을 나눈다
		int second=num%3600%60; // 마지막 남은 시간에서 분을 A 나머지 시간을 초로 계산한다
		
		System.out.print(hours + "시간" + minute + "분" + second + "초");
		
		
		/*int second=s.nextInt();
		int minute=second/60;
		int hour=second/(60*60);
		
		int minute2=(second-(hour*(60*60)))/60;                                                  넌 바보야 간단한걸 생각 못하니 위에좀 본받아라
		int second2=second-((hour*(60*60))+(minute2*60));
		System.out.print(hour+ "시간" + minute2 + "분" + second2 + "초\n");*/
	
		
		
		
		
	}
}
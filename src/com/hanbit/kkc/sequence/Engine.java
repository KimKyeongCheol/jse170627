package com.hanbit.kkc.sequence;

import java.util.Scanner;
public class Engine{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
			
		while(true){
			
			System.out.print("0.종료, 1.시작 ,2. ,3.  : ");
				String menu=scan.next();
			
			switch(menu){
				
			case "0":
				System.out.print("종료합니다.\n");
				return;
			case "1":
				System.out.print("시작합니다.\n");
				break;
			case "2":
				
				break;
			case "3":
				break;
			default :
				
			}
		}
		
	}
}
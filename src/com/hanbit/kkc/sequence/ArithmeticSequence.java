package com.hanbit.kkc.sequence;


import java.util.Scanner;
public class ArithmeticSequence{

	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		int i=0;
		System.out.print("단입력\t");
		int su=scan.nextInt();
		for(;i<9;){
			
			i++;
			System.out.print(su+"*"+i+"="+su*i+"\n");
			
		}
		System.out.print("\n");
		
	
	}
}
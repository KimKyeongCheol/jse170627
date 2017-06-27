package com.hanbit.kkc.sequence;


import java.util.Scanner;
public class gugudan{

	public static void main(String[] args){
		
		while(true){
			Scanner scan=new Scanner(System.in);
			System.out.print("단입력 : (0.종료, 100. 전체보기)");
			int su=scan.nextInt();
			if(su==0){
				System.out.print("종료합니다.");
				break;
			}else if(su==100){
				for(int i=1;i<=9;i++){
			for(int j=2;j<=9;j++){
			
			System.out.print(j+"*"+i+"="+j*i+"\t");
			}
			System.out.println();
			}
			break;
			}
			for(int k=1;k<=9;k++){
				System.out.print(su+"*"+k+"="+su*k+"\t");
			}
			System.out.println();
		
		}
	}
}
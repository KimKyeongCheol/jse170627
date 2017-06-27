package com.hanbit.kkc.grade;

import java.util.Scanner;
class Ranking{
	public static void main(String[] args){
		System.out.print("#########성적 랭킹##########\n");
		Scanner s = new Scanner(System.in);
		int[] arr = new int[5];
		String[] names = new String[5];
		int temp=0;
		String temp2="";
		for(int i=0;i<arr.length;i++){
			System.out.print("이름을 입력해주세요..\n");
			names[i] = s.next();
			System.out.print(names[i] + "학생의 점수를 입력해주세요\n");
			arr[i] = s.nextInt();
		}
		
		/*
		가장 큰 값부터 작은 순으로 나열하는 statement를 완성하시오
		예를 들어 a=4, b=7, c=1 을 입력했다면 7,4,1이 되겠습니다..
		*/
		
		
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]<arr[j]){
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
					temp2=names[i];
					names[i]=names[j];
					names[j]=temp2;
				}
			}
		}
		
		System.out.print(names[0] + arr[0] + "점\t" + names[1] + arr[1] + "점\t" + names[2] + arr[2] 
		+ "점\t" + names[3] + arr[3] + "점\t" + names[4] + arr[4] + "점\n");
	}
}
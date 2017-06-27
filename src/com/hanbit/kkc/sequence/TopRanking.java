package com.hanbit.kkc.sequence;
import java.util.Scanner;
public class TopRanking{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int sum=0,avg=0,max=0,min=100;	//이것은 배열로 전환
		
		System.out.print("1반의 학생수는 총 몇명?? \n");
		int number=s.nextInt();
		
		int[] students=new int[number];
		for(int i=0;i<students.length;i++){
		System.out.print(i+1+"번째 학생의 평균 점수 입력하세요(100점만점)?\n");
		students[i]=s.nextInt();
		}
		
		
		//이번에는 length가 동적인 배열을 선언해야합니다.
		//그리고 그 수만큼 for loop을 돌고 점수를 입력받습니다.
		//현재는 1등점수와 꼴찌 점수를 구하는 로직만 구합니다.
		
		for(int i=0;i<students.length;i++){
			if(students[i]>max){
				max=students[i];
			}
			if(students[i]<min){
				min=students[i];
			}
			sum+=students[i];
		}
		avg=sum/students.length;
		
		System.out.println("1반의 평균점수는 " + avg);
		System.out.println("최대 점수는 " + max);
		System.out.println("최소점수는 " + min);
	}
}
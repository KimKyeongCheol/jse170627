package com.hanbit.kkc.grade;

import java.util.Scanner;
public class GradeReport{
		public static void main(String[] args){
			Scanner scan=new Scanner(System.in);
			int kor=0,eng=0,math=0,total=0,avg=0;
			// 90~100 A , 89~80 B 
			String name="", to="";
			System.out.print("이름 : ");
			name=scan.next();
			System.out.print("국어 점수입력 : ");
			kor=scan.nextInt();
			System.out.print("영어 점수입력 : ");
			eng=scan.nextInt();
			System.out.print("수학 점수입력 : ");
			math=scan.nextInt();
			
			total=kor+eng+math;
			avg=total/3;
			
			/*
			if(avg<59){
				to="F";
			}else if(avg<69){
				to="D";
			}else if(avg<79){
				to="C";
			}else if(avg<89){
				to="B";
			}else{
				to="A";
			}
			*/
			if(avg>=90){
				to="A";
			}else if(avg>=80){
				to="B";
			}else if(avg>=70){
				to="C";
			}else if(avg>=60){
				to="D";
			}else{
				to="F";
			}
			System.out.print("=================================== 성 적 확 인 ============================================\n");
			System.out.println();
			System.out.print(name+"님은 "+to+"학점입니다, 총점 :"+ total+"점,  평균 : "+avg+"점  | 국어 : "+kor+"점, 영어 : "+eng+"점, 수학 : "+math+"점 | \n");
			System.out.print("============================================================================================\n");			
			
		}
}
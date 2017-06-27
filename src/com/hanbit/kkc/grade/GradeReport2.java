package com.hanbit.kkc.grade;

import java.util.Scanner;
public class GradeReport2{
		public static void main(String[] args){
			Scanner scan=new Scanner(System.in);
			int kor=0,eng=0,math=0,total=0,avg=0;
			// 90~100 A , 89~80 B 
			String name="", to="",result="";
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
			
			
			switch(avg/10){
				case 10 :
					
					result="장학생입니다.";
					break;
				case 9:
					result = "장학금 대상입니다.";
					break;
				case 8: 
					result = "3학점 이수 성공 ";
					break;
				case 7:
					result = "2학점 이수 성공 ";
					break;
				case 6: 
					result = "1학점 이수 성공 ";
					break;
				default  :
					result = "학사 경고!!";
					break;	
			}
			
			System.out.print("=================================== 성 적 확 인 ============================================\n");
			System.out.println();
			System.out.print(name+"님은 "+to+"학점입니다, 총점 :"+ total+"점,  평균 : "+avg+"점  | 국어 : "+kor+"점, 영어 : "+eng+"점, 수학 : "+math+"점 | \n"+result);
			System.out.print("============================================================================================\n");			
			
		}
}
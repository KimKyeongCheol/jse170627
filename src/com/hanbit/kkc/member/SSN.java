package com.hanbit.kkc.member;

import java.util.Scanner;
public class SSN{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		
		String ssn="", gender="" , name=""; 
		
		
		
	System.out.print("이름을 입력하세요\n");
	name=s.next(); 
	System.out.print("\n");
	
	System.out.print("주민등록번호를 입력하세요\n");
	ssn=s.next();
		String sYear=ssn.substring(0,2); //sYear이라는 변수는 ssn값에서 0번?부터 2개를 추출한다 
		int year=Integer.parseInt(sYear); //sYear이라는 문자형 변수를 인티저에게 정수형으로 바꾸게 해서 year란 변수에 저장한다  
		int age=0;
		int gap=17-year;
	
	char ch = ssn.charAt(7);// ssn 이라는 문자열에 7번째에 있는 문자 하나
	gender="";
	
	
		if(gap>=0){age=2017-(year+2000)+1;
			
		}else{age=2017-(year+1900)+1;
			
		} 
	
	switch(ch){ // char 타입은 ""이 아니라 ''으로 따옴표를 쳐야한다
		
		case '1' : gender="남자"; 
		
		break;
		
		case '2' : gender="여자";
		
		break ;
		
		case '3' : gender="남자";
		
		break;
		
		case '4' : gender="여자";
		
		break;
		
		
		
	}
	System.out.print("************************\n");
	System.out.print("|  이름 |  나이  |  성별 |\n");
	System.out.print("------------------------\n");
	System.out.print("| " + name + "| " + " |  " + age + " | " +  gender + " | \n" );
	System.out.print("************************\n");
	}
}
package com.hanbit.kkc.calculator;
import java.util.Scanner;
public class Calculator2{
	
	public static void main(String[] args){
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Enter Integer : ");
		int num1=scan.nextInt();
		System.out.print("연산자입력 : ");
		String op=scan.next();
		
		System.out.print("Enter Integer : ");
		int num2=scan.nextInt();
		int res=0;
	if(op.equals("+")){
		res=num1+num2;
	}else if(op.equals("-")){
		res=num1-num2;
	}else if(op.equals("*")){
		res=num1*num2;
	}else {
		res=num1/num2;
		
	}
//	System.out.print(num1+op+num2 +"="+res);,
	System.out.print(String.format("%d%s%d=%d",num1,op,num2,res));
	
}
}
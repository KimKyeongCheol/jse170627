package com.hanbit.kkc.calculator;
import java.util.Scanner;
public class Calculator{
public static void main(String[] args){
System.out.print("계산기\n");
Scanner scan = new Scanner(System.in);
System.out.print("Enter Integer : " );
int num1=scan.nextInt();
System.out.print("연산자를 고르세요 1. + , 2. - ,3. * ,4./ \n");
int opcode=scan.nextInt();
System.out.print("Enter Integer : " );
int num2=scan.nextInt();
int result=0;
if(opcode==1){
result = num1+num2;
}else if(opcode==2){
result = num1-num2;
}else if(opcode==3){
result = num1*num2;
}else{
result = num1/num2;
}
System.out.print(result);

}
}
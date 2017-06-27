package com.hanbit.kkc.sequence;
public class SequenceArray{
	public static void main(String[] args){
		int[] arr=new int[10];
		for(int i=0;i<10;){
			
			arr[i]=i+1;
			i++;
			}
		int sum=0;
		for(int i=0;i<arr.length;i++){
			System.out.print(i+1+"\t");
			sum+=arr[i];
		}
		System.out.print("SUM : "+sum);
		
	}
}
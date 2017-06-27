package com.hanbit.kkc.matrix;

public class MrSmith1{
	public static void main(String[] args){
		
		int[][] mtx=new int[4][7];
		
	for(int i=0;i<mtx.length;i++){
		
		for(int j=0;j<mtx[i].length;j++){
			System.out.print(String.format("[%d][%d] ",i,j));

			
		}
					System.out.print("\n");
	}
	}
}
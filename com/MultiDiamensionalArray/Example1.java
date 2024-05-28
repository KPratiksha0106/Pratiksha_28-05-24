package com.MultiDiamensionalArray;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);         
		System.out.println("Enter the row: ");
		int row= sc.nextInt();
		System.out.println("Enter the col: ");
		int col=sc.nextInt();

		
		//multidimensional array

		//array object creation
    	int matrix[][] = new int[row][col];
//
//		//initialized values to an array object
//		matrix[0][0] = 56;
//		matrix[0][1] = 49;
//
//		matrix[1][0] = 64;
//		matrix[1][1] = 78;


		//iterate the array values
		for(int i = 0; i <row; i++)
		{
			for(int j = 0; j <col; j++)
			{
				matrix[i][j]=(i+1)*(j+1);
				
			}
		}

		System.out.println();

		//iterate the array values
		for(int i = 0; i < row; i++)
		{
			for(int j = 0; j < col; j++)
			{
				System.out.print(matrix[i][j]+"\t");
			}
			System.out.println("\n\n");
		}

	}

}

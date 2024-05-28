package com.MultiDiamensionalArray;

import java.util.Scanner;

public class Example3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);  
		System.out.println("Entwr rows and columns");
		int rows= sc.nextInt();
		int columns= sc.nextInt();

		int matrix[][]= new int[rows][columns];
		System.out.println("Enter Arrays Values");
		for(int i= 0;i<rows;i++) 
		{
			for(int j=0;j<columns;j++) 
			{
				matrix[i][j]=sc.nextInt();




			}


		}
		for(int i = 0; i < rows; i++)
		{
			for(int j = 0; j < columns; j++)
			{
				System.out.print(matrix[i][j]+"\t");
			}
			System.out.println("\n\n");
		}







	}


}

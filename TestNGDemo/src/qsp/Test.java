package qsp;

import java.util.Scanner;

public class Test {
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the rows:");
		int row = s.nextInt();

		System.out.println("Enter the cols:");
		int col = s.nextInt();

		int[][] a = new int[row][col];

		System.out.println("Enter the elements:");
		
		for (int i=0; i<row; i++)
		{
			for (int j=0; j<col; j++)
			{
				a[i][j]=s.nextInt();
			}
		}

		System.out.println("The matrix is..");

		for (int i=0; i<row; i++)
		{
			for (int j=0; j<col; j++)
			{
				System.out.print(a[i][j]);
				System.out.print(' ');
			}
			System.out.println();
		}
	
	}
	
}

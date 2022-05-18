package test;

import java.util.Random;
import java.util.Scanner;

public class ColumnChart {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("요소 수:");
		int n = stdIn.nextInt();
		int[] a = new int[n];
		
		for(int i=0; i<n; i++)
			a[i] = 1 + rand.nextInt(10);
		
		for(int i=10; i>=1; i--) {
			for(int j=0; j<n; j++)
				if(a[j]>=i)
					System.out.print("* ");
				else
					System.out.print("  ");
			
			System.out.println();
		}
		
	}

}
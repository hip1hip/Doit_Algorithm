package chap01;

import java.util.Scanner;

public class SumFor02 {


		public static void main(String[] args) {

			Scanner stdIn = new Scanner(System.in);
			
			System.out.println("1���� n������ ���� ���սô�.");
			System.out.print("n�� �� : ");
			int n = stdIn.nextInt();
			
			int sum = 0;
			
			for (int i = 1; i <= n; ++i) 
			{
				sum += i;
				System.out.print(i + " + " );
				}
			System.out.println(" = " + sum);
			
			
//			System.out.println("1���� " + n + "������ ���� " + sum + "�Դϴ�. ");
			
			
			
			
			
			
			
		}

	}

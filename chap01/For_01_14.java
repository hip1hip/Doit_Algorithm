package chap01;

import java.util.Scanner;

public class For_01_14 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("사각형을 출력합니다.");
		System.out.print("단 수 : ");
		int num = stdIn.nextInt();
		
		
		for (int i = 1; i <= num; i++) {
			for ( int j = 1; j <=num; j++) {
				System.out.print(  "*" );
			}
			System.out.println();
		}
			
		
		
	}

}
		

package chap01;

import java.util.Scanner;

public class Min3 {
	static int min3(int a , int b, int c ) {
	int min= a;
	if ( b < min )
		min = b;
	if ( c < min )
		min = c;
	
	return min;
	
	}
	
	
	public static void main(String[] args) {
		 Scanner stdIn = new Scanner(System.in);
		 int a, b, c;
	      System.out.println("�� ������ �ּڰ��� ���մϴ�.");
	      System.out.print("a�� ����");  a = stdIn.nextInt();
	      System.out.print("b�� ����");  b = stdIn.nextInt();
	      System.out.print("c�� ����");  c = stdIn.nextInt();
	      
	      
	      int min123 = min3(a, b, c); 
	      
	      System.out.println("�ּڰ��� " + min123 + "�Դϴ�.");

	}

}

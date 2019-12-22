package cn.pat.kartoffel;

import java.util.Scanner;
public class PTA1006 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int n1 = num / 100;
		int n2 = num % 100 / 10;
		int n3 = num % 10;
		
		while(n1>0) {
			System.out.print("B");
			n1 --;
		}
		while(n2>0) {
			System.out.print("S");
			n2 --;
		}
		for(int i = 1 ; i <= n3 ; i ++) {
			System.out.print(i);
		}
	}
}

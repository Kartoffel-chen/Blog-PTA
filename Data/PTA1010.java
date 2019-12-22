package cn.pat.kartoffel;

import java.util.Scanner;
public class PTA1010 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		long a=0;
		long b=0;
		long c=0;
		boolean[] arr = new boolean[num];
		for(int i = 0 ; i < num ; i ++) {
			a = in.nextLong();
			b= in.nextLong();
			c = in.nextLong();
			arr[i] = a + b > c;
		}
		for(int i = 0 ; i < arr.length ; i ++) {
			System.out.println("Case #"+(i+1)+": " +arr[i]);
		}
	}
}	

package cn.pat.kartoffel;

import java.util.Scanner;
public class PTA1009 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String say = in.next();
		String[] arr = say.split(" ");
		for(int i = arr.length - 1 ; i >= 0 ; i --) {
				System.out.print(arr[i]);
				if(i!=0) {
					System.out.print(" ");
				}
		}
	}
}

package cn.pat.kartoffel;

import java.util.Scanner;
public class PTA1008 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int num = in.nextInt();
		int[] arr = new int[size];
		for(int i = 0 ; i < arr.length ; i ++) {
			arr[i] = in.nextInt();
		}
		for(int j = 0 ; j < num ; j ++) {
			int temp = arr[arr.length - 1] ;
			for(int i = arr.length - 1 ; i > 0 ; i --) {
				arr[i] = arr[i-1];
			}
			arr[0] = temp;
				
		}
		for(int i = 0 ; i < arr.length ; i ++) {
			if(i!=arr.length-1) {
				System.out.print(arr[i] + " ");
			}else {
			System.out.print(arr[i]);
			}
		}
	}
}

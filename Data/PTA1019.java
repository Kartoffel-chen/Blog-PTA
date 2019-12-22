package cn.pat.kartoffel;

import java.util.Arrays;
import java.util.Scanner;

public class PTA1019 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String num = in.nextLine();
		in.close(); //释放
		int[] arr = new int[4];
		int key = 0;
		while(key != 6174) {
			
			for(int i = 0 ; i < num.length() ; i ++) {
				arr[i] = (int)(num.charAt(i)-'0'); 
			}
			Arrays.sort(arr);  //1.数组排序(小到大)
			String minShow = show(arr);	 			
			int min = changeNum(arr);
			int indext = 0;
			for(int i = 0 ; i < arr.length / 2; i ++) {  //反转数组
				indext = arr[i];
				arr[i] = arr[arr.length - 1 - i];
				arr[arr.length - 1 - i] = indext;
			}
			String maxShow = show(arr);	 
			int max = changeNum(arr);
			key = max - min ;
			if(key == 0) {
				System.out.printf("%s - %s = 0000",maxShow,minShow);
				return;
			}else if(key<1000) {
				System.out.printf("%s - %s = 0%d\n",maxShow,minShow,key);
			}else if(key<100) {
				System.out.printf("%s - %s = 00%d\n",maxShow,minShow,key);
			}else if(key<10) {
				System.out.printf("%s - %s = 000%d\n",maxShow,minShow,key);
			}else {
				System.out.printf("%s - %s = %d\n",maxShow,minShow,key);
			}
			num = key + "";
		}
	}	
	public static String show(int[] arr) {
		String arrstr = "";
		for(int arr_i  = 0;arr_i<arr.length;arr_i++) {
			arrstr += String.valueOf(arr[arr_i]);
		}
		return arrstr;
	}
	public static int changeNum(int[] arr) {
		int number = 0;
		for(int e : arr) {
			number = number * 10 + e;
		}
		return number;
	}
}

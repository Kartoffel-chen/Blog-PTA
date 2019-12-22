package cn.pat.kartoffel;

/*思路
 	 接收字符串可能是好的选择
 	 用charAt(i) 对每一个比较,相同 n ++;
	 创建 n 个 i
*/

import java.util.Scanner;
public class PTA1016 {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String number = in.nextLine();
		in.close();
		String[] arr = number.split("\\s+");
		String a1 = arr[0];
		String a2 = arr[1];
		String b1 = arr[2];
		String b2 = arr[3] ;
		
		char key1 = a2.charAt(0);
		char key2 = b2.charAt(0);
		int p1 = haveNum(a1,key1);
		int p2 = haveNum(b1,key2);
		System.out.println(p1+p2);
	}
	public static int haveNum(String num , char key) {
		int n = (int)(key-'0');
		int str = 0;
		String strcc = "";
		for(int i = 0 ; i < num.length() ; i ++) {
			char tool = num.charAt(i);
			if(tool == key) {
				str = str*10 + n;
			}
		}
		return str;
	}
}

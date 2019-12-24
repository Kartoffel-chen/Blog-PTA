package cn.pat.kartoffel;

/**
  * 题目要求意思就是转10进制转1~9进制
  * 一个转换进制的方法
  * 除D取余,先得到的余数后输出
 * @author kartoffel
 */
import java.util.Scanner;
public class PTA1022 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int A = in.nextInt();
		int B = in.nextInt();
		int D = in.nextInt();
		
		int n = (int) Math.pow(2, 30);
		in.close();
		if(D == 10 || A + B == 0 || A + B < D) {
			System.out.println(A + B);
			return;
		}	
		String num = change(A + B , D);
		for(int i = num.length() -1 ; i >= 0 ; i --) {
			System.out.print(num.charAt(i));
		}
	}
	
	//进制转换方法
	public static String change(int number , int key) {
		int temp = 0;
		String last = "";
		int tool = 0 ;
		while(number != 0){  //被除进以后退出循环
			//m / d = n + x;
			//首先要判断出n的取值
			int num = 0;
			if(number % key == 0) {
				temp = number / key;
			}else {
				for(int i = number/key ; i < number; i ++) {
					tool = number - ( key * i);
					if(key > tool) {
						temp = i;
						break;
					}
				}				
			}
			num = number - (temp * key);
			last = last + num;
			number = temp;
			if(number < key) {
				last = last + number;
				number = 0;
			}
		}
		return last;
	}
	
}


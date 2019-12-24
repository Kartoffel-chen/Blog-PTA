package cn.pat.kartoffel;

/**
 * (这次先把输入要求好好分析下防止出上个作业的错误,虽然上次也应该没错)
 * 每个输入包含 1 个测试用例，即一个不超过 1000 位的正整数 N。 说明输入的应该是一个数
 * 然后用对出现在这个数据的各个数字统计次数
 * 嗯~~~~
 * *我的想法是 : 疯了吧,一天没事统计数字出现字数干毛啊*
 * 既然要统计次数,应该要遍历的吧,既然要遍历,那用String的charAt(i)可能更好
 * 然后对每次遍历的字符进行判断
 * 开搞!
 * @author kartoffel
 */

import java.util.Scanner;
public class PTA1021 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String num = in.nextLine();   //接收数据
		char temp = '0';              //接收数据的每个字符
		int[] numArr = new int[10];   //存放0~9次数
		
		for(int i = 0 ; i < num.length() ; i ++) {
			temp = num.charAt(i);

			
			//对字符进行判断
			switch(temp){
			case '0' : 
				numArr[0] = numArr[0] + 1;
				break;
			case '1' : 
				numArr[1] = numArr[1] + 1;
				break;
			case '2' : 
				numArr[2] = numArr[2] + 1;
				break;
			case '3' : 
				numArr[3] = numArr[3] + 1;
				break;
			case '4' : 
				numArr[4] = numArr[4] + 1;
				break;
			case '5' : 
				numArr[5] = numArr[5] + 1;
				break;
			case '6' : 
				numArr[6] = numArr[6] + 1;
				break;
			case '7' : 
				numArr[7] = numArr[7] + 1;
				break;
			case '8' : 
				numArr[8] = numArr[8] + 1;
				break;
			case '9' : 
				numArr[9] = numArr[9] + 1;
				break;
			}	
		}
		
		
		//循环结束,对数组进行遍历输出操作
		for(int i = 0 ; i < numArr.length ; i++) {
			if(numArr[i] == 0) {  //如果数组的数为空跳出此次循环
				continue;
			}
			System.out.printf("%d : %d\n",i ,numArr[i]);
		}
	}
}

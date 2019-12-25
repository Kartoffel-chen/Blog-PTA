package cn.pat.kartoffel;


/**
 * 题目要求是把正则表达式转换为常数(不知道表达是不是正确的,这是我心里的想法)
 * 我们可以看到每一个正则表达式都有一个E字母,我们需要把E前面的数字和后面的数字分开,然后才能用来计算还原
 * 既然要分开,那我就会用到String来接收这一行,然后按split("E"),来把这个数据拆分为两个数据,然后就可以计算了
 * @author kartoffel
 */

import java.util.Scanner;
public class PTA1024 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String line = in.nextLine();//接收数据
		String[] numArr = line.split("[E.]");  //以E分为两个数组		
		int herd = 	Integer.parseInt(numArr[0]);	//小数点前的数
		int foot = 	Integer.parseInt(numArr[2]);	//E后面的指数
		//numArr[1] 代表小数点后面的数字
		
		
		if(foot >= 0) {      //指数大于等于0就是后移
			if(herd != 0) {  //首先先判断小数点前的数是否等于0,如果等于0,第一个0就可以省略
				System.out.print(herd);
			}
			if(foot==0) {      //这里判断指数是否等于0
				System.out.print("." + numArr[1]);
				return;
			}
			int index = 0 ;
			if(foot < numArr[1].length()) {   //小于小数部分的长度 
				for(int i = 0 ; i < foot ; i ++) {
					System.out.print(numArr[1].charAt(i));   //循环输出指数大小的小数部分的每一个字符
					index = i;                               //这里记录输出到那个字符的下标
				}
				System.out.print(".");                       
				for(int j = index+1 ; j < numArr[1].length() ; j ++) {   //接收上一次输出字符的下标,继续输出后面的字符
					System.out.print(numArr[1].charAt(j));     
				}
			}else if(foot > numArr[1].length()) {   //大于小数部分的长度,说名要往后面添0
				System.out.print(numArr[1]);
				//这里可以做一个简化,减少循环次数,提高效率
				int x = (foot - numArr[1].length()) % 10;
				int y = (foot - numArr[1].length()) / 10;
				
				if(y!=0) {
					for(int i = 0 ; i < y ; i ++) {
						System.out.print("0000000000");
					}
					for(int i = 0 ; i < x ; i ++) {
						System.out.print("0");
					}
				}else {
					for(int i = 0 ; i < (foot - numArr[1].length()) ; i ++) {
						System.out.print("0");
					}
				}
			}else {     //等于小数部分的长度,直接输出小数部分
				System.out.print(numArr[1]); 
			}
		}else {   //指数小于0,前移
			if(numArr[0].charAt(0) == '-') {
				System.out.print("-");
				herd = - herd;
			}
			System.out.print("0.");	
			//这里可以做一个简化,减少循环次数,提高效率
			int x = ((-foot) - 1) % 10;
			int y = ((-foot) - 1) / 10;
			if(y!=0) {
				for(int i = 0 ; i < y ;i ++ ) {
					System.out.print("0000000000");
				}
				for(int i = 0 ; i < x ; i ++) {
					System.out.print("0");
				}
			}else {
				for(int i = 0 ; i < (-foot) - 1 ;i ++ ) {
					System.out.print("0");
				}
			}
			System.out.print(herd + numArr[1]);	
		}
	}
}

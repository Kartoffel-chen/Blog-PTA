package cn.pat.kartoffel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *  思考
 * 首先输入一个数字 ,代表后面测试几组数据(比如3,说明第二排,第三排就为3组数据)(种类不超过1000)
 * 第二个数字表示市场需求量(不超过500万吨)
 * 题目需求为,需要我们找到最大收益策略
 * 首先,我们需要知道每种类型的库存单价是多少(肯定是单价越高的,卖得越多,收获越多涩)
 * 知道单价以后单价高的全部卖掉,不够得单价其次得补,然后继续补
 * 现在考虑存放数据问题:我打算创建两个数组一[库存]二[总价]
 * 大概就这样  开整!!!!
 * @author kartoffel
 *
 */

import java.util.Scanner;
public class PTA1020 {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();   //库存
		int need = in.nextInt();   //市场需求
		int[] inventory = getValue(size);   //库存
		int[] totalValue = getValue(size);   //总价
		
//		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//		String arr1 = br.readLine();
//		String arr2 = br.readLine();
////		String arr1 = "18 15 10";
////		String arr2 = "75 72 45";
//		String[] arr3 = arr1.split("\\s+");
//		String[] arr4 = arr2.split("\\s+");
		
		
//		
//
//		int[] inventory = new int[3];
//		int[] totalValue = new int[3];
//		
//		for(int i = 0 ; i < arr3.length;i ++) {
//			inventory[i] = Integer.parseInt(arr3[i]);
//		}
//		for(int i = 0 ; i < arr4.length;i ++) {
//			totalValue[i] = Integer.parseInt(arr4[i]);
//		}
//		double[] unitPrice = new double[size];   //单价
//		double money = 0;
//		
		
//		int size = 3;
//		int need = 20;
//		int[] inventory = {50,50,50};
//		int[] totalValue = {75,72,45};
		//计算单价
		double money = 0;
		double[] unitPrice = new double[size];
		double temp = 0;
		for(int i = 0 ; i < size ; i ++) {
			temp = (double)totalValue[i] / inventory[i];
			unitPrice[i] = temp;
		}

		//
		while(need != 0) {   //库存不等于0时循环
			double value = unitPrice[0];
			int indext = 0;
			for(int i = 1 ; i < size ; i ++) {  //这次循环用来找出最大单价下标
				if(value < unitPrice[i]) {
					value = unitPrice[i];
					indext = i;
				}
			}
			//找到最大值下标为 i ;
			if(need - inventory[indext] <= 0) {
				inventory[indext] = need;
				need = 0;
			}else {
				need = need - inventory[indext];
			}
			money += (double)inventory[indext] * unitPrice[indext];
			//把单价数组最大值变为0,以便于下一次找最大值
			unitPrice[indext] = 0;
		}
		
		System.out.printf("%4.02f",money);
		
	}
	public static int[] getValue(int size) {
		Scanner in = new Scanner(System.in);
		int[] arr = new int[size];
		for(int i = 0 ; i < size ; i++) {
			arr[i] = in.nextInt();
		}
		return arr;
	}
	
}

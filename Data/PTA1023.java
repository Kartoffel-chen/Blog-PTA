package cn.pat.kartoffel;


/**
 * 
    题目的意思是,分别从0到9给出每个数字的个数,然后通过这些给出的数字进行组合,组合成一个最小的数字出来
    输入要求是,在一行输入10个非负数用空格隔开,那这里我就用一行字符串的方式接收数据了
    0~9个数字刚好对应一个数组的下标 就用数组
    然后遍历数组取出有效的数据,比如(2个0,就是有效数据,0个5就是无效的)
    把有效数据存放在一个新数组中,这个数组的大小就是有效数据的个数
    排序组合的话,我们先找到一个非0的最小值放在第一个位置,然后对剩下的数组进行从小到大排序就好了涩
    整!!

 * @author kartoffel
 */

import java.util.Scanner;
public class PTA1023 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String num = in.nextLine();
		String[] numArr = num.split("\\s+");  //接收一行
		int[] arr = new int[numArr.length];
		for(int i = 0 ; i < arr.length ; i ++) {
			arr[i] = Integer.parseInt(numArr[i]);
		}
		
		//遍历数组找出有效数组个数
		int size = 0;
		for(int i = 0 ; i < arr.length ; i ++) {
			if(arr[i] != 0) {
				size += arr[i];
			}
		}
		
		System.out.println(size);
		//存放数据
		int[] temp = new int[size];
		int tool = 0;
		for(int i = 0 ; i < arr.length ; i ++) {
			if(arr[i] != 0) {
				for(int j = 0 ; j < arr[i] ; j ++ ) {
					temp[tool] = i;
					tool ++;
				}
			}
		}	
		int key = temp[0];
		if(key == 0) {
			for(int i = 1 ; i < temp.length ; i ++){
				if(temp[i] != 0) {
					temp[0] = temp[i];
					temp[i] = key;
					break;
				}
			}	
		}
		
		for(int e : temp) {
			System.out.print(e);
		}		
	}
}

package cn.pat.kartoffel;

import java.util.Scanner;
public class PTA1004 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//控制输入学生人数
		int nos = in.nextInt();
		String[][] student = new String[nos][3];
		int[] grate = new int[nos];
		for(int i = 0 ; i < nos ; i ++) {
			for(int j = 0 ; j < 3 ; j ++) {
				student[i][j] = in.next();
			}
			grate[i] = Integer.parseInt(student[i][2]);
		}
		//判断大小
		int max,min,maxIndex,minIndex;
		max = min = maxIndex = minIndex = 0;
		
		//遍历分数数组
		max = grate[0];
		min = grate[0];
		for(int i = 1 ; i < grate.length ;i ++) {
			if(max < grate[i]) {
				max = grate[i];
				maxIndex = i;
			}
			if(min > grate[i]) {
				min = grate[i];
				minIndex = i;
			}
		}
		System.out.println(student[maxIndex][0]+" "+student[maxIndex][1]);
		System.out.println(student[minIndex][0]+" "+student[minIndex][1]);
	}
}

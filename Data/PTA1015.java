package cn.pat.kartoffel;


/**
 *思路:
   	创建两个二维数组,一个存放总体学生的学号,德成绩,才成绩.另一个存放录取德学生信息
   	判断学生是合格以及是否超过有限录取线
   	按照条件排序输出
   		先判断 : stuArr[1]>minNum和stuArr[2]>maxNum
   				满足 stuArr[1] + stuArr[2] ;
 * @author kartoffel
 *
 */
import java.util.Scanner;
public class PTA1015 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int stuNum = in .nextInt();  //学生人数
		int minNum = in.nextInt();   //最低录取线
		int maxNum = in.nextInt();   //优先录取线
		
		int[][] stuArr = new int[stuNum][3];   //学生数组
		int[][] a1 = new int[stuNum][2];   //过优先线的学生数组
		int[][] a2 = new int[stuNum][2];   //德分过,才分没过学生数组
		int[][] a3 = new int[stuNum][2];   //都没过优先,但是德大于才学生数组
		int[][] a4 = new int[stuNum][2];   //的不大于才
		int number = 0;     //录取学生数量
		//存放数据到学生数组
		for(int i = 0 ; i < stuArr.length ; i ++) {
			for(int  j = 0 ; j < stuArr[i].length ; j ++) {
				stuArr[i][j] = in.nextInt();
			}
		}
		
		//判断是否过线
		for(int i = 0 ; i < stuArr.length ; i ++) {
			if(stuArr[i][1] > minNum && stuArr[i][2] > minNum) { //判断是否或最低线
				number ++; 
				if(stuArr[i][1] > maxNum && stuArr[i][2] > maxNum) {	//判断是否过优先线
					a1[i][0] = i;
					a1[i][1] = stuArr[i][1] + stuArr[i][1];
				}else if(stuArr[i][1] > maxNum && stuArr[i][2] < maxNum){  //德分过,才分没过
					a2[i][0] = i;
					a2[i][1] = stuArr[i][1] + stuArr[i][1];
				}else if(stuArr[i][1] < maxNum && stuArr[i][2] < maxNum){  //德分没过,才没分过
					if(stuArr[i][1] > stuArr[i][2]) {   //德分大于才分
						a3[i][0] = i;
						a3[i][1] = stuArr[i][1] + stuArr[i][1];
					}else {
						a4[i][0] = i;
						a4[i][1] = stuArr[i][1] + stuArr[i][1];
					}
				}
			}else {
				//没有过最低线
				break; 
			}
		}
//		int index = 0;
//		int num = 0;
//		for(int i = 0 ; i < a1.length ; i ++) {
//			if(a1[index][1] < a1[i][1]) {
//				num = a1[index][1];
//				a1[index][1] = a1[i][1];
//				a1[i][1] = num;
//			}
//		}
//		System.out.println(number);
	}
}

package cn.pat.kartoffel;

/**
 * 
 * 思路
 	1.需要记录两个人胜负平的次数(由于两个
 	    人属于对立,所以一个人的胜负平次数是对面的倒叙,比如 甲赢4次,
  	    对应的乙就输了4次)所以可以只创建一个数组存放一个玩家的数据
   	2. 甲每赢一次 判断赢得比赛用的是那个
 * @author kartoffel
 *
 */
import java.util.Scanner;
public class PTA1018 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String number = in.nextLine();
		int num = Integer.parseInt(number);
		int win = 0;  //赢
		int lose = 0; //输
		int draw = 0; //平局
		int[] xArr = new int[3];
		int[] yArr = new int[3]; //0 C 1 J 2 B 
		
		
		for(int i = 0 ; i < num ; i ++) {  //循环判断
			String str = in.nextLine();
			String[] arr = str.split("\\s+");
			char x = arr[0].charAt(0);  //获取甲方出招
			char y = arr[1].charAt(0);  //获取乙方出招
			int temp = WinOrLose(x,y);  //接收输赢平结果 -1代表输 1 代表赢 0表示平局
			if(temp == -1) {
				lose ++;
				if(x == 'C') {
					yArr[2] = yArr[2] + 1;
				}else if(x == 'J'){
					yArr[0] = yArr[0] + 1;
				}else {
					yArr[1] = yArr[1] + 1;
				}
			}else if(temp == 1){
				win ++;
				if(x =='C') {
					xArr[0] = xArr[0] + 1;
				}else if(x == 'J'){
					xArr[1] = xArr[1] + 1;
				}else {
					xArr[2] = xArr[2] + 1;
				}
			}else {
				draw ++;
			}
		}
		System.out.printf("%d %d %d\n",win,draw,lose);
		System.out.printf("%d %d %d\n",lose,draw,win);
		System.out.print(bidui(xArr) + ' ' +bidui(yArr));
	}
	//返回最大值下标
	static String bidui(int a[]) {
		if(a[0]>a[1]&&a[0]>a[2]) {
			return "C" ;}
		else if(a[1]>a[0]&&a[1]>a[2]) {
			return"J";}
		else if(a[2]>a[0]&&a[2]>a[1]){
			return"B";}		
		else if(a[0]==a[1]&&a[0]>a[2]){
			return"B";}
		else if(a[0]>a[1]&&a[0]==a[2]){
			return"B";}
		else if(a[1]>a[0]&&a[1]==a[2]){
			return"B";}
		else if(a[0]==a[1]&&a[0]==a[2]){
			return"B";}		
		return  null;
	}
	
	//判断输赢 -1代表输 1 代表赢 0表示平局
	public static int WinOrLose(char x , char y) {
		//c 表示 锤子
		//j 表示剪刀
		//b 表示步
		if(x == 'C' && y == 'J') { //垂直赢剪刀
			return 1;
		}else if(x == 'J' && y == 'B') { //剪刀赢步
			return 1;
		}else if(x == 'B' && y == 'C') { //布赢锤子
			return 1;
		}else if(x == y ) {  //相同平局
			return 0;
		}else { //都不满足 输
			return -1;
		}
		
	}
}

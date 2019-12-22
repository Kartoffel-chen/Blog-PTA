package cn.pat.kartoffel;

/**
 * 
 * ˼·
 	1.��Ҫ��¼������ʤ��ƽ�Ĵ���(��������
 	    �����ڶ���,����һ���˵�ʤ��ƽ�����Ƕ���ĵ���,���� ��Ӯ4��,
  	    ��Ӧ���Ҿ�����4��)���Կ���ֻ����һ��������һ����ҵ�����
   	2. ��ÿӮһ�� �ж�Ӯ�ñ����õ����Ǹ�
 * @author kartoffel
 *
 */
import java.util.Scanner;
public class PTA1018 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String number = in.nextLine();
		int num = Integer.parseInt(number);
		int win = 0;  //Ӯ
		int lose = 0; //��
		int draw = 0; //ƽ��
		int[] xArr = new int[3];
		int[] yArr = new int[3]; //0 C 1 J 2 B 
		
		
		for(int i = 0 ; i < num ; i ++) {  //ѭ���ж�
			String str = in.nextLine();
			String[] arr = str.split("\\s+");
			char x = arr[0].charAt(0);  //��ȡ�׷�����
			char y = arr[1].charAt(0);  //��ȡ�ҷ�����
			int temp = WinOrLose(x,y);  //������Ӯƽ��� -1������ 1 ����Ӯ 0��ʾƽ��
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
	//�������ֵ�±�
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
	
	//�ж���Ӯ -1������ 1 ����Ӯ 0��ʾƽ��
	public static int WinOrLose(char x , char y) {
		//c ��ʾ ����
		//j ��ʾ����
		//b ��ʾ��
		if(x == 'C' && y == 'J') { //��ֱӮ����
			return 1;
		}else if(x == 'J' && y == 'B') { //����Ӯ��
			return 1;
		}else if(x == 'B' && y == 'C') { //��Ӯ����
			return 1;
		}else if(x == y ) {  //��ͬƽ��
			return 0;
		}else { //�������� ��
			return -1;
		}
		
	}
}

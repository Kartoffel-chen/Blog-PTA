package cn.pat.kartoffel;


/**
 * ��ĿҪ���ǰ�������ʽת��Ϊ����(��֪������ǲ�����ȷ��,������������뷨)
 * ���ǿ��Կ���ÿһ��������ʽ����һ��E��ĸ,������Ҫ��Eǰ������ֺͺ�������ַֿ�,Ȼ������������㻹ԭ
 * ��ȻҪ�ֿ�,���Ҿͻ��õ�String��������һ��,Ȼ��split("E"),����������ݲ��Ϊ��������,Ȼ��Ϳ��Լ�����
 * @author kartoffel
 */

import java.util.Scanner;
public class PTA1024 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String line = in.nextLine();//��������
		String[] numArr = line.split("[E.]");  //��E��Ϊ��������		
		int herd = 	Integer.parseInt(numArr[0]);	//С����ǰ����
		int foot = 	Integer.parseInt(numArr[2]);	//E�����ָ��
		//numArr[1] ����С������������
		
		
		if(foot >= 0) {      //ָ�����ڵ���0���Ǻ���
			if(herd != 0) {  //�������ж�С����ǰ�����Ƿ����0,�������0,��һ��0�Ϳ���ʡ��
				System.out.print(herd);
			}
			if(foot==0) {      //�����ж�ָ���Ƿ����0
				System.out.print("." + numArr[1]);
				return;
			}
			int index = 0 ;
			if(foot < numArr[1].length()) {   //С��С�����ֵĳ��� 
				for(int i = 0 ; i < foot ; i ++) {
					System.out.print(numArr[1].charAt(i));   //ѭ�����ָ����С��С�����ֵ�ÿһ���ַ�
					index = i;                               //�����¼������Ǹ��ַ����±�
				}
				System.out.print(".");                       
				for(int j = index+1 ; j < numArr[1].length() ; j ++) {   //������һ������ַ����±�,�������������ַ�
					System.out.print(numArr[1].charAt(j));     
				}
			}else if(foot > numArr[1].length()) {   //����С�����ֵĳ���,˵��Ҫ��������0
				System.out.print(numArr[1]);
				//���������һ����,����ѭ������,���Ч��
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
			}else {     //����С�����ֵĳ���,ֱ�����С������
				System.out.print(numArr[1]); 
			}
		}else {   //ָ��С��0,ǰ��
			if(numArr[0].charAt(0) == '-') {
				System.out.print("-");
				herd = - herd;
			}
			System.out.print("0.");	
			//���������һ����,����ѭ������,���Ч��
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

package cn.pat.kartoffel;

/**
 * (����Ȱ�����Ҫ��ú÷����·�ֹ���ϸ���ҵ�Ĵ���,��Ȼ�ϴ�ҲӦ��û��)
 * ÿ��������� 1 ��������������һ�������� 1000 λ�������� N�� ˵�������Ӧ����һ����
 * Ȼ���öԳ�����������ݵĸ�������ͳ�ƴ���
 * ��~~~~
 * *�ҵ��뷨�� : ���˰�,һ��û��ͳ�����ֳ���������ë��*
 * ��ȻҪͳ�ƴ���,Ӧ��Ҫ�����İ�,��ȻҪ����,����String��charAt(i)���ܸ���
 * Ȼ���ÿ�α������ַ������ж�
 * ����!
 * @author kartoffel
 */

import java.util.Scanner;
public class PTA1021 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String num = in.nextLine();   //��������
		char temp = '0';              //�������ݵ�ÿ���ַ�
		int[] numArr = new int[10];   //���0~9����
		
		for(int i = 0 ; i < num.length() ; i ++) {
			temp = num.charAt(i);

			
			//���ַ������ж�
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
		
		
		//ѭ������,��������б����������
		for(int i = 0 ; i < numArr.length ; i++) {
			if(numArr[i] == 0) {  //����������Ϊ�������˴�ѭ��
				continue;
			}
			System.out.printf("%d : %d\n",i ,numArr[i]);
		}
	}
}

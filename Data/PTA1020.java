package cn.pat.kartoffel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *  ˼��
 * ��������һ������ ,���������Լ�������(����3,˵���ڶ���,�����ž�Ϊ3������)(���಻����1000)
 * �ڶ������ֱ�ʾ�г�������(������500���)
 * ��Ŀ����Ϊ,��Ҫ�����ҵ�����������
 * ����,������Ҫ֪��ÿ�����͵Ŀ�浥���Ƕ���(�϶��ǵ���Խ�ߵ�,����Խ��,�ջ�Խ��ɬ)
 * ֪�������Ժ󵥼۸ߵ�ȫ������,�����õ�����εò�,Ȼ�������
 * ���ڿ��Ǵ����������:�Ҵ��㴴����������һ[���]��[�ܼ�]
 * ��ž�����  ����!!!!
 * @author kartoffel
 *
 */

import java.util.Scanner;
public class PTA1020 {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();   //���
		int need = in.nextInt();   //�г�����
		int[] inventory = getValue(size);   //���
		int[] totalValue = getValue(size);   //�ܼ�
		
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
//		double[] unitPrice = new double[size];   //����
//		double money = 0;
//		
		
//		int size = 3;
//		int need = 20;
//		int[] inventory = {50,50,50};
//		int[] totalValue = {75,72,45};
		//���㵥��
		double money = 0;
		double[] unitPrice = new double[size];
		double temp = 0;
		for(int i = 0 ; i < size ; i ++) {
			temp = (double)totalValue[i] / inventory[i];
			unitPrice[i] = temp;
		}

		//
		while(need != 0) {   //��治����0ʱѭ��
			double value = unitPrice[0];
			int indext = 0;
			for(int i = 1 ; i < size ; i ++) {  //���ѭ�������ҳ���󵥼��±�
				if(value < unitPrice[i]) {
					value = unitPrice[i];
					indext = i;
				}
			}
			//�ҵ����ֵ�±�Ϊ i ;
			if(need - inventory[indext] <= 0) {
				inventory[indext] = need;
				need = 0;
			}else {
				need = need - inventory[indext];
			}
			money += (double)inventory[indext] * unitPrice[indext];
			//�ѵ����������ֵ��Ϊ0,�Ա�����һ�������ֵ
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

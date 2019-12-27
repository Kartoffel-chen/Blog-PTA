package cn.pat.kartoffel;


/**
 * ��ĿҪ��������һ����,Ȼ���ҳ����0����������е�����,�����ҳ�������������Ϊ2�ĸ���
 * �����������0���������е�����,�ַ�����ʽ����Կո����,������ͳ���������ĸ���
 * Ȼ��תΪ����,��������,�ж�����
 * @author kartoffel
 *
 */

import java.util.Scanner;
public class PTA1007 {
	public static void main(String[] args) {
/*-------------------------------�ڶ��ַ���--------------------------------------*/
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		in.close();
		
		if(num == 0 || num == 1) {
			System.out.println(0);
			return;
		}
		int size = 0;
		for(int i = 2 ; i <= num ; i ++) {
			if(isTrue(i)) {
				if(i + 2 <= num && isTrue(i+2)) {
					System.out.print(i + " ");
					System.out.println(i+2);
					size ++;
				}
			}
		}
		System.out.println(size);
	
	}
	//�ж��Ƿ�Ϊ����
	public static boolean isTrue(int a) {
		 if(a==1){
	         return false;
	     }
	     if(a%2==0&&a!=2){
	         return false;
	     }
	     for(int i=3;i<=Math.sqrt(a);i+=2){
	         if(a%i==0){
	             return false;
	         } 
	     }
	     return true;
	}
}	



/*-------------------------------��һ�ַ���--------------------------------------*/
//		Scanner in = new Scanner(System.in);
//		int num = in.nextInt();   
//		in.close();
//		String str1 = "";
//		String str2 = "";
//		int size1 = 0 ;
//		int size2 = 0 ;
//		if(num == 0 || num == 1) {
//			System.out.println(0);
//			return;
//		}
//		
//		int index = 2;
//		while(true) {
//			if(isTrue(index)) {
//				if(index > 0 && index<=4000) {
//					str1 = str1 + (index + " ");
//					size1 ++;
//				}else if(index > 4000 && index < 10000) {
//					str2 = str2 + (index + " ");
//					size2 ++;
//				}
//			}
//			if(index == num) {
//				break;
//			}
//			index ++;
//		}
//
//		String[] arr1 = str1.split("\\s+");
//		int[] numArr1 = new int[size1];
//		for(int i = 0 ; i < arr1.length ; i ++) {
//			numArr1[i] = Integer.parseInt(arr1[i]);
//		}
//
//		if(str2.length() != 0) {
//			int[] numArr2 = new int[size2];
//			String[] arr2 = str2.split("\\s+");
//			for(String e : arr2) {
//				System.out.print(e + " ");
//			}
//			
//			for(int i = 0 ; i < arr2.length ; i ++) {
//				numArr2[i] = Integer.parseInt(arr2[i]);
//			}
//			if(numArr2[0] - numArr1[numArr1.length - 1] == 2) {
//				System.out.println(haveTrue(numArr1) + haveTrue(numArr2) + 1);
//			}
//			System.out.println(haveTrue(numArr1) + haveTrue(numArr2));
//			return;
//		}
//		System.out.println(haveTrue(numArr1));
//		
//	}
//	//ͳ�Ƹ���
//	public static int haveTrue(int[] arr) {
//		int temp = 0;
//		for(int i = 0 ; i < arr.length - 1 ; i ++) {
//			if(arr[i+1] - arr[i] == 2) {
//				temp ++;
//			}
//		}
//		return temp;
//	}
//	//�ж��Ƿ�Ϊ����
//	public static boolean isTrue(int a) {
//		 if(a==1){
//	         return false;
//	     }
//	     if(a%2==0&&a!=2){
//	         return false;
//	     }
//	     for(int i=3;i<=Math.sqrt(a);i+=2){
//	         if(a%i==0){
//	             return false;
//	         } 
//	     }
//	     return true;
//	}
//}

package cn.pat.kartoffel;


/**
 * 
    ��Ŀ����˼��,�ֱ��0��9����ÿ�����ֵĸ���,Ȼ��ͨ����Щ���������ֽ������,��ϳ�һ����С�����ֳ���
    ����Ҫ����,��һ������10���Ǹ����ÿո����,�������Ҿ���һ���ַ����ķ�ʽ����������
    0~9�����ָպö�Ӧһ��������±� ��������
    Ȼ���������ȡ����Ч������,����(2��0,������Ч����,0��5������Ч��)
    ����Ч���ݴ����һ����������,�������Ĵ�С������Ч���ݵĸ���
    ������ϵĻ�,�������ҵ�һ����0����Сֵ���ڵ�һ��λ��,Ȼ���ʣ�µ�������д�С��������ͺ���ɬ
    ��!!

 * @author kartoffel
 */

import java.util.Scanner;
public class PTA1023 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String num = in.nextLine();
		String[] numArr = num.split("\\s+");  //����һ��
		int[] arr = new int[numArr.length];
		for(int i = 0 ; i < arr.length ; i ++) {
			arr[i] = Integer.parseInt(numArr[i]);
		}
		
		//���������ҳ���Ч�������
		int size = 0;
		for(int i = 0 ; i < arr.length ; i ++) {
			if(arr[i] != 0) {
				size += arr[i];
			}
		}
		
		System.out.println(size);
		//�������
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

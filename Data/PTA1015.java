package cn.pat.kartoffel;


/**
 *˼·:
   	����������ά����,һ���������ѧ����ѧ��,�³ɼ�,�ųɼ�.��һ�����¼ȡ��ѧ����Ϣ
   	�ж�ѧ���Ǻϸ��Լ��Ƿ񳬹�����¼ȡ��
   	���������������
   		���ж� : stuArr[1]>minNum��stuArr[2]>maxNum
   				���� stuArr[1] + stuArr[2] ;
 * @author kartoffel
 *
 */
import java.util.Scanner;
public class PTA1015 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int stuNum = in .nextInt();  //ѧ������
		int minNum = in.nextInt();   //���¼ȡ��
		int maxNum = in.nextInt();   //����¼ȡ��
		
		int[][] stuArr = new int[stuNum][3];   //ѧ������
		int[][] a1 = new int[stuNum][2];   //�������ߵ�ѧ������
		int[][] a2 = new int[stuNum][2];   //�·ֹ�,�ŷ�û��ѧ������
		int[][] a3 = new int[stuNum][2];   //��û������,���ǵ´��ڲ�ѧ������
		int[][] a4 = new int[stuNum][2];   //�Ĳ����ڲ�
		int number = 0;     //¼ȡѧ������
		//������ݵ�ѧ������
		for(int i = 0 ; i < stuArr.length ; i ++) {
			for(int  j = 0 ; j < stuArr[i].length ; j ++) {
				stuArr[i][j] = in.nextInt();
			}
		}
		
		//�ж��Ƿ����
		for(int i = 0 ; i < stuArr.length ; i ++) {
			if(stuArr[i][1] > minNum && stuArr[i][2] > minNum) { //�ж��Ƿ�������
				number ++; 
				if(stuArr[i][1] > maxNum && stuArr[i][2] > maxNum) {	//�ж��Ƿ��������
					a1[i][0] = i;
					a1[i][1] = stuArr[i][1] + stuArr[i][1];
				}else if(stuArr[i][1] > maxNum && stuArr[i][2] < maxNum){  //�·ֹ�,�ŷ�û��
					a2[i][0] = i;
					a2[i][1] = stuArr[i][1] + stuArr[i][1];
				}else if(stuArr[i][1] < maxNum && stuArr[i][2] < maxNum){  //�·�û��,��û�ֹ�
					if(stuArr[i][1] > stuArr[i][2]) {   //�·ִ��ڲŷ�
						a3[i][0] = i;
						a3[i][1] = stuArr[i][1] + stuArr[i][1];
					}else {
						a4[i][0] = i;
						a4[i][1] = stuArr[i][1] + stuArr[i][1];
					}
				}
			}else {
				//û�й������
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

package cn.pat.kartoffel;

/**
 * ���κ�һ�������� n���������ż������ô��������һ�룻���������������ô�� (3n+1) ����һ�롣
 * ����һֱ��������ȥ�����һ����ĳһ���õ� n=1���������� 1950 ���������ѧ�Ҵ���Ϲ�����������룬
 * ��˵��ʱҮ³��ѧʦ���붯Ա��ƴ����֤�����ò�ƺ�ɵ����������⣬����ֵ�ѧ��������ѧҵ��һ��ֻ֤ (3n+1)��
 * ����������˵����һ����ı�����������������ӻ�������ѧ���ѧ����еĽ�չ����
   	���ǽ������Ŀ����֤�������Ȳ��룬���ǶԸ�������һ������ 1000 �������� n���򵥵���һ�£���Ҫ���ٲ��������£����ܵõ� n=1��
 * @author kartoffel
 *
 */
import java.util.Scanner;

public class PTA1001 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("������һ��1~1000�������� : ");
		//��������
		int num = in.nextInt();
		if(num<1||num>1000) {
			System.out.println("�������ֲ��Ϸ�");
		}	
		int index = 0;
		
		while(num != 1) {
			//�ж�
			if(num % 2 == 0) {
				num = num / 2;
			}else if(num % 2 == 1){
				num = (3 * num + 1) / 2;
			}
			index ++;
		}
		
		System.out.println(index);
	}
}

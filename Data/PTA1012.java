package cn.pat.kartoffel;
import java.util.Scanner; 
public class PTA1012 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int[] arr = new int[num];
		for(int i = 0 ; i < arr.length ; i ++) {
			arr[i] = in.nextInt();
		}	
		float[] numArr = new float[5];
		int index = 0;
		int temp = 0 ;
		int pow = 0;
		int a1 = 0;
		int a2 = 0;
		int a3 = 0;
		int a4 = 0;
		int a5 = 0;
		for(int i = 0 ; i < arr.length ; i ++) {
			temp = arr[i];
			if(temp % 5 == 0) {
				if(temp % 2 == 0) {
					numArr[0] = numArr[0] + temp;
				}
			}
			if(temp % 5 == 1) {
				numArr[1] = numArr[1] + ((int)Math.pow(-1, pow)*temp);
				pow ++;
			}
			if(temp % 5 == 2) {
				numArr[2] ++;
			}
			if(temp % 5 == 3) {
				index ++;
				numArr[3] = (numArr[3] + temp);
			}
			if(temp % 5 == 4) {
				if(temp>a5) {
					numArr[4] = temp;
				}
			}
		}
		for(int i = 0 ; i < numArr.length ; i ++) {
			if(i == 4) {
				System.out.print((int)numArr[i]);
			}else if(i == 3) {
				if(numArr[3] == 0) {
					System.out.print("N ");
				}else {
					System.out.print(String.format("%.1f",(numArr[3] / index)) + " ");
				}
			}else if(numArr[i] == 0) {
				System.out.print("N ");
			}else {
				System.out.print((int)numArr[i] + " ");
			}
		}	
	}
}

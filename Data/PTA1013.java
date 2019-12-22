package cn.pat.kartoffel;

import java.util.Scanner;
public class PTA1013 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int min = in.nextInt();
		int max = in.nextInt();
		int index = 0;
		int num = 0;
		for(int i = 2 ; ; i ++) {
			if(isTrue(i)) {
				index ++;
				if(index >=min && index <=max) {
						num ++ ; 
						System.out.print(i);	
						if(num % 10  == 0) {
							System.out.println();
						}else if(num == max - min + 1){
							return;
						}else {
							System.out.print(" ");
						}
						
				}
				if(index == max) {
					break;
				}
			}
		}
	}
	
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

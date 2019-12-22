package cn.pat.kartoffel;

import java.util.Scanner;
public class PTA1002 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);	
		String num = in.nextLine();
		int sum = 0;
		
		for(int i = 0 ; i < num.length(); i ++) {
			sum = sum + Integer.parseInt(num.charAt(i) + "");
		}		
		String newNum = String.valueOf(sum);
		
		 for (int i = 0; i < newNum.length() ; i++) {
            int unit = Integer.parseInt(newNum.charAt(i)+"");       
            switch(unit){
                case 1 :System.out.print("yi");break;
                case 2 :System.out.print("er");break;
                case 3 :System.out.print("san");break;
                case 4 :System.out.print("si");break;
                case 5 :System.out.print("wu");break;
                case 6 :System.out.print("liu");break;
                case 7 :System.out.print("qi");break;
                case 8 :System.out.print("ba");break;
                case 9 :System.out.print("jiu");break;
                case 0 :System.out.print("ling");break;    
            }
            if(i < newNum.length()-1){
                System.out.print(" ");
            }
		 }
	}
}

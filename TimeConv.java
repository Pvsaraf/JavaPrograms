package myCaptain;

import java.util.Scanner;


public class TimeConv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
        System.out.println("Input the number of minutes:");
        
         int min = sc.nextInt();
        
         int days = min/1440;
         
         int years=days/365;
         
         days=days%365;
         
         System.out.println(min+" minutes is approximately "+years+" years and "+days+" days");
        
	}

}

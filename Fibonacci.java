package myCaptain;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Fibonacci numbers to be printed");
        int n = sc.nextInt();
        if(n==1)
        	System.out.println(0);
        else if(n==2)
        	System.out.println(0+" "+1);
        else
        {
        	int a=0,b=1,c;
        	System.out.print(a+" "+b);
        	for(int i=0;i<n-2;i++)
        	{
        		c=a+b;
        		System.out.print(" "+c);
        		a=b;
        		b=c;
        	}
        }
        
	}

}

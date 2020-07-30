package myCaptain;

import java.util.Scanner;

public class PrimeChallenge {
	
	public static boolean isPrime(int x)
	{
		boolean ans = true;
		if(x==1)
			return false;
		else
		{
			for(int i=2;i<=Math.sqrt(x);i++)
			{
				if(x%i==0)
				{
					ans = false;
					break;
				}
			}
			return ans;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Please insert any number");
        int n = sc.nextInt();
        if(isPrime(n))
        	System.out.println(n+" is a prime number");
        else
        	System.out.println(n+" is not a prime number");
	}

}

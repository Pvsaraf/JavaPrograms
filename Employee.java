package myCaptain;

import java.util.Scanner;

public class Employee {
	
	static int year;
	static String name,address;
	static Scanner sc = new Scanner (System.in);
	
	public static void getName()
	{
//		System.out.println("Enter the name:");
		name = sc.nextLine();
	}

	public static void printName()
	{
		System.out.print(name+"\t\t");
	}

	public static void getYear()
	{
//		System.out.println("Enter the year of joining:");
		year = sc.nextInt();
	}

	public static void printYear()
	{
		System.out.print(year+"\t\t");
	}
	
	public static void getAddress()
	{
//		System.out.println("Enter the Address:");
		sc.nextLine();
		address = sc.nextLine();
	}

	public static void printAddress()
	{
		System.out.println(address);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("Enter the name,year of joining and address of 3 employees :");
        System.out.println("Name \t  Year of joining  \t Address");
        for(int i=0;i<3;i++)
        {
        	getName();     	
        	getYear();
        	getAddress();
        	printName();
        	printYear();
        	printAddress();
        }
	}

}

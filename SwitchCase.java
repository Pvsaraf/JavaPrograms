package myCaptain;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        
        int option;
        System.out.println("\t\t\t\t MENU");
        System.out.println("\nEnter your option:\n 1.Hi\n 2.Hey\n 3.Hello");
        option=sc.nextInt();
        switch(option)
        {
           case 1 :System.out.println("You printed Hi");
                   break;
           case 2 :System.out.println("You printed Hey");
                   break;
           case 3 :System.out.println("You printed Hello");
                   break;
           default:System.out.println("Invalid choice");
                   break;
        }
	}

}

package test;

import java.util.Scanner;

public class stringDemo {

	public static void main(String[] args) {
		String s1= new String();
		Scanner sc=new Scanner(System.in);
		int c=0;
		System.out.println("Enter the sentence");
		s1=sc.nextLine();
		for (int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			if (ch=='a')
			{
				c++;
				
			}
			
		}
		System.out.println("No of times a="+c);
	}

}

package test;
import java.util.*;


public class test1 {

	public static void main(String[] args) {
		String s=new String();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the sentence=");
		s=" "+sc.nextLine();
		
				String t1="";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch==' ')
			{
				t1=t1+ch;
				i++;
				ch=s.charAt(i);
				t1=t1+Character.toUpperCase(ch);
				
			}
			else {
				t1=t1+ch;
			}
			
	}
		t1=t1.trim();
		System.out.print(t1);
}}
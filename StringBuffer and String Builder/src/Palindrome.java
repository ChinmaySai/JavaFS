import java.io.*;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s1="NITIN";
        String s2="";
        char a[]=s1.toCharArray();
        for(int i=s1.length()-1;i>=0;i--)
        {
        	s2=s2+s1.charAt(i);
        }
        
        if(s1.equals(s2)) {
        	System.out.println("Palindrome");
        }
        else
        {
        	System.out.println("Not a Palindrome");
        }
	}

}

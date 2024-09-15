import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {

		String s1="race";
		String s2="Care";
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		char a[]=s1.toCharArray();//Convert the String s1 to Char Array
		char b[]=s2.toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
		boolean i=Arrays.equals(a, b);
		if(i)
		{
			System.out.println("Anagram");
		}
		else
		{
			System.out.println("Not a Anagram");
		}
		
	}

}

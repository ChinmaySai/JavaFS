import java.util.Scanner;
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s="Chinmay";
		String s2=""; 
		for(int i=s.length()-1;i>=0;i--)
		{
			s2=s2+s.charAt(i);
		}
		System.out.println(s2);
		
		//Chinmay Sai ----- iaS yamnihC
		s="Chinmay Sai"; 
		String arr[]=s.split(" ");
		String revstring="";
		for(int i=arr.length-1;i>=0;i--)
		{
			
			for(int index=arr[i].length()-1;index>=0;index--)
			{
				revstring=revstring+arr[i].charAt(index);
			}
			revstring=revstring+" ";
		}
		System.out.println(revstring);
		
		//Chinmay Sai ----- Sai Chinmay
		revstring="";
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
		   
	} 

}

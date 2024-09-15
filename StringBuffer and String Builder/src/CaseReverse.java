import java.util.Scanner;

public class CaseReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s2="";
        System.out.print("Enter the String that you are willing to reverse the Case :");
        Scanner sc=new Scanner(System.in);
        String s3=sc.nextLine(); 
        for(int i=0;i<s3.length();i++)
        {
        	if(s3.charAt(i)>=97&&s3.charAt(i)<123)
        	{
        		s2=s2+(char)(s3.charAt(i)-32);
        	}
        	else if(s3.charAt(i)>=65&&s3.charAt(i)<91)
        	{
        		s2=s2+(char)(s3.charAt(i)+32);
        	}
        	else
        	{ 
        		s2=s2+" ";
        	}
        }
        System.out.println("Reversed Case String "+s2);
        
        /*
         * next()---Taken the input until it encounters a Space/Delimeter(/n)
         *       ---Keeps the Cursor in the Same Line after taking the input
         *       Does not read the newline character.
         *       
         * nextLine()
         *        ---Taken the input until it encounters a Delimiter(/n) or Enter
         *        ---moves the Cursor to the next Line after taking input
         *        Reads until the next newline character is encountered, including the newline character.
         *  
         *  Refer NextVsNextLine code for good understanding regarding next() vs nextLine() difference
         * */
         
        
	}

}

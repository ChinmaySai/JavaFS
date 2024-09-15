
public class Panagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String s1="The quick brown fox jumps over the lazy dog";
         s1=s1.replace(" ","");
         s1=s1.toLowerCase();
         boolean val=true;
         int a[]=new int[26];
         for(int i=0;i<s1.length();i++)
         {
        	 a[s1.charAt(i)-97]++;
         }
         for(int i:a)
         {
        	 if(i==0)
        	 {
        		 val=false;
        		 break;
        	 }
         }
         if(val==true)
         {
        	 System.out.println("Panagram");
         }
         else
         {
        	 System.out.println("Not a Panagram");
         }
	}

}

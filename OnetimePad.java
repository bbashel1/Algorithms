
import java.util.Scanner;

public class OnetimePad{
	  public static String Encryption(String plaintext,String key)
	 {
	  plaintext=plaintext.toLowerCase();
	  msg m1=new msg();
	  int pt[]=new int[plaintext.length()];
	  int k[]=new int[key.length()];
	  int ct[]=new int[plaintext.length()];
	   
	  for(int i=0;i < plaintext.length();i++)
	  {
	   pt[i]=m1.Ipos(plaintext.charAt(i));
	  }
	  for(int i=0;i < key.length();i++)
	  {
	   k[i]=m1.Ipos(key.charAt(i));
	  }
	  int j=0;
	  for(int i=0;i < plaintext.length();i++)
	  {
	   ct[i]=pt[i]+k[j];
	   j++;
	   if(j==key.length())
	    j=0; 
	   if(ct[i]>25)
	    ct[i]=ct[i]%25;
	  }
	  String cipher="";
	  for(int i=0;i < plaintext.length();i++)
	  {
	   cipher+=m1.Cpos(ct[i]);
	  }
	   
	  return cipher;
	 }
	  public static void main(String args[])throws Exception
	  {
	    
	    
	   String plaintext,key;
	   Scanner scan=new Scanner(System.in);
	    
	    
	   System.out.println("Enter plaintext new:");
	   plaintext=scan.nextLine();

	   key ="asdsdtslrstsjndflksdfkdskhgsdlaoierittdzzzxcvbnasdfghjkqwertyuiopzxcvbnmkefjdfghsgahsjclzxasdietelkfsjhadsjasdmasddkjasdkjadfasjdhjakshfjkwjgdfsjfakdjkafhqsdasfakjbfhjasdhbasmdasdasjkdaskjdasjdasdasjkdasdswwqeqkkkrgfndfsdlkgg ";
	   OnetimePad OneTimePad=new OnetimePad();
	    
	   String ciphertext=OneTimePad.Encryption(plaintext,key);
	    
	   System.out.println("Encrpted text is:"+ ciphertext);
	  }
}
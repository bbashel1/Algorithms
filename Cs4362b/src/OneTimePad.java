public class OneTimePad
{
    public static String encryptionMessage(String s)
    {
        int i, j;
        int randombit[] = new int[8]; //random bit patterns = randombit
        for (i = 0; i < 7; i++)
        {
            randombit[i] = (i % 2 == 0) ? 1 : 0;
        }
        char asc[] = new char[s.length()];
        for (i = 0; i < s.length(); i++)
        {
            asc[i] = (char) ((int) s.charAt(i));
        }
        DoOperation b1 = new DoOperation();
        String cipherText = new String("");
        for (i = 0; i < asc.length; i++)
        {
            int temp = (int) (asc[i]);
            int len = b1.decimalToBinary(temp);
            int bintemp[] = new int[7];
            int xorlen;
            if (len == 7)
            {
                for (j = 1; j <= len; j++)
                {
                    bintemp[j - 1] = b1.binaryArrayAtPosition(j);
                }
                // XOR Operation
                xorlen = b1.xorop(bintemp, randombit, len);
            }
            else
            {
                // System.out.println("\n less than 7 :"+len);
                bintemp[0] = 0;
                for (j = 1; j <= len; j++)
                {
                    bintemp[j] = b1.binaryArrayAtPosition(j);
                }
                // XOR Operation
                xorlen = b1.xorop(bintemp, randombit, len + 1);
            }
            int xor[] = new int[xorlen];
            for (j = 0; j < xorlen; j++)
            {
                xor[j] = b1.xorinArrayAt(j);
                cipherText = cipherText + xor[j];
            }
            cipherText += " ";
        }
        return (cipherText);
    }
 
 
    public static void main(String[] args)
    {
    	String in= new String ("0100001");
        System.out.println("encrypted message in binary : "
                + encryptionMessage(in));
        
        System.out.println( "Your enrypted binary numbers is saying: " 
                + in );
        
    }
}

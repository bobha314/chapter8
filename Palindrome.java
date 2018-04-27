

/**
 * Robert Ha
 */
public class Palindrome
{
    
    /**
     * Default constructor for objects of class Palindrome
     */
    public Palindrome(String palindrome)
    {
        
    }
    
    public static boolean Check(String palin)
    {
        
        
        if (palin.length() == 0 || palin.length() == 1)
        {
            return true;
        }
        else if (palin.charAt(0) == palin.charAt(palin.length()-1))
        {
            return Check(palin.substring(1, palin.length()-1));
        }
        else
        {
            return false;
        }
    }
        
    public static void main (String[] args)
    {
        System.out.println(Check("wasitaratisaw"));
        System.out.println(Check("totot"));
    }
}

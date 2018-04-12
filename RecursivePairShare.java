

/**
 * Robert Ha
 * 4/4/18
 */
public class RecursivePairShare
{
    public static void main (String[] args)
    {
        System.out.println(nTozero(5));
    }
    
   

    public static String nTozero(int n)
    {
        if (n == 0)
            return "done";
            
        else 
        {
            return n + " " + nTozero(n-1) + " ";
        }
    }
}

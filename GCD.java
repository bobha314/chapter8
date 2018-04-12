

/**
 * Robert Ha
 * get greatest common denominator
 */
public class GCD
{
    /**
     * Default constructor for objects of class GCD
     */
    public GCD() {}      
    
    public static int gcd(int num1, int num2)
    {
        /*
        int ognum1 = num1;
        int ognum2 = num2;
        
        if (num1 % num2 == 0 && ognum2 % num1 == 0)
        {
            return num2;
        }
        else if (num2 % num1 == 0 && ognum1 % num2 == 0)
        {
            return num1;
        }
        
        if (num1 > num2)
        {
            int factor = num2;
            return gcd(num1, num2-1);
        }
        else if (num1 < num2)
        {
            int factor = num1;
            return gcd(num1-1, num2);
        }
        else
        {
            return num1;
        }
        */
        
        if (num1 % factor == 0 && num2 % factor == 0)
        {
            return factor;
        }
        else
        {
            factor--;
            return gcd(num1, num2);
        }      
    }
    
    public static void main (String[] args)
    {
        System.out.println(gcd(20,7));
    }
}

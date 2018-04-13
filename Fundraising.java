

/**
 * Robert Ha
 */
public class Fundraising
{
    /**
     * Default constructor for objects of class Fundraising
     */
    public Fundraising() {}
    
    public static int Collect(int goal)
    {
        if (goal == 1)
            return goal;
        else 
            return Collect(goal/10);
        }
    
    public static void main (String[] args)
    {
        System.out.println(Collect(1000));
    }
}

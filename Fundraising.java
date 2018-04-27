

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
        System.out.println(goal);
        if (goal == 1)
            return 1;
        else
        {
            
            return Collect(goal/10)+Collect(goal/10)+Collect(goal/10)+Collect(goal/10)+Collect(goal/10)+
            Collect(goal/10)+Collect(goal/10)+Collect(goal/10)+Collect(goal/10)+Collect(goal/10)+1;
        }
    }
    
    public static void main (String[] args)
    {
        System.out.println(Collect(1000));
    }
}

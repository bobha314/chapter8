/**
 * Robert Ha
 */

public class Money
{
    public Money() {}

    public static int getMoney(double price)
    {
        if (price == 0)
        {
            return 0;
        }
        else if (price >= 100)
        {
            //price = price - (int)price/100;
            System.out.println("100");
            return getMoney(price - 100);
        }        
        else if (price >= 20)
        {
            System.out.println("20");
            return getMoney(price - 20);
        }
        else if (price >= 5)
        {
            System.out.println("5");
            return getMoney(price - 5);           
        }
        else 
        {
            System.out.println("1");
            return getMoney(price - 1);
        }
    }
    
    public static void main (String[] args)
    {
        getMoney(220);
    }
}
//price % 100 != 0 && price % 20 != 0 && price % 5 != 0
/********************************************************************
// These are the notes for ch 3 used in hayes class


import
//******************************************************************* */


import javax.swing.*;
import java.util.*;

public class ch8starter
{



	// good to use constants to difine arrays
	final static int  MAX = 5000000;
	//static int whatever = 0;

	  public static void main (String[] args)
   {


	   System.out.println(sum(5) + "-----");
	   System.out.println(multi(5,4));

	   System.out.println("\nPair Share Outputs:\n");

	   printNum(5);

	   System.out.println();
	   printReverseNum(5);

	   System.out.println();
	   System.out.println(reverseWord("word"));

	   System.out.println();
	   prime(113,112);

	   System.out.println();




	  // System.out.println( "is" + pow(3,3) );
/**/
	   //make int array of 100 and pop with 100 random int' 1-500
/*
		int[] num = new int[MAX];
		Random gen = new Random();



		for ( int i = 0; i < MAX ; i++)
			num[i] = gen.nextInt(1000000)+1;

		for (int j = 4980000 ; j<MAX; j++)
			System.out.print(num[j]+"\t");


		//Make an array or strings with 10 names
		String[] names = {"Mike", "Jon", "Amber", "Jane",
						  "James", "Homer", "Alex", "Nic",
						  "Emy", "Nolan", "Christine", "Dave"};





/*
	//System.out.println( pow (4,3) + "p");

	System.out.println(reverse("abcd");
	reverse("abcd");


		//ei();
/**/
	//infinite(5);
/**/
   }// end of main







public static int pow (int a, int b)
{

	return 0;
}


 public static double  btp(int a, int b)
{
	return 0;
}


	public static int foo(int num)
	{

		return 0;

	}










		public static void ei ()
		{

		}


	public static int multi (int a, int b)
	{
		if (b == 0)
			return 0;
		else
			return a + multi(a,b-1);
	}



	public static int sum(int num)
	{
		if (num == 0)
			return 0;
		else
			return num + sum(num-1);
	}

	public static void printNum(int num)
	{
		if (num == 0)
		{
			System.out.println(0);
			return;
		}
		else
		{
			printNum(num-1);
			System.out.println(num);
		}
	}

	public static void printReverseNum(int num)
		{
			if (num == 0)
			{
				System.out.println(0);
				return;
			}
			else
			{
				System.out.println(num);
				printReverseNum(num-1);
			}
	}

	public static String reverseWord (String word)
	{
		String newWord = new String();

		if (word.length() == 1)
			return word;

		else
		{
			newWord = reverseWord(word.substring(1));
			return newWord += word.substring(0,1);
		}

	}

	public static void prime (int num, int divide)
	{
		//System.out.println(num + " - " + divide);
		if (divide == 1)
		{
			System.out.println("Prime");
			return;
		}
		else if (num % divide == 0)
		{
			System.out.println("Not prime");
			return;
		}
		else
		{
			prime(num, divide-1);
		}
	}

}//end of class
















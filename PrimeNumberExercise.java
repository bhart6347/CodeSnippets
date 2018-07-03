//Branden Hart 10/30/17 6:30pm

package primenumberexercise;
import java.util.Scanner;

public class PrimeNumberExercise
{

    public static void main(String[] args)
{
    int n;
    int count=0;/*This is a division counter. A Prime Number is an integer that
    is only divisible by itself and one. For example 3 can only be divided by 
    itself and one. Long story short: prime numbers can only have two 
    denominators.
    */
    
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number: ");
    n=sc.nextInt();
    
    
    for(int i=1;i<=n;i++)
    {
        if(n%i==0)
        {
            count++; //increment
        }
    }
    
    
    if(count==2)//this indicates it is a prime number
    {
        System.out.println(n +" a Prime Number");
    }
    else
    {
        System.out.println(n + " is Not a Prime Number");
    }
}
}

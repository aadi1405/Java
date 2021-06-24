
import java.util.*;
public class factorial
{
    public static void main(String[] args)
 
    {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter number"); //asking for input
        int n = inp.nextInt(); //taking the number
        int result=1;
        if (n==0 | n==1)
        {
            System.out.println("1"); //if n =0 or 1 , factorial is 1
        }
        else
        {
            while (n!=0) //runs till n is not equal to 0
            {
                result= result * n; //calculates factorial step by step
                n=n-1; //value of n gets decremented for each loop
                
            }
        }
        System.out.println("the factorial is " + result);
        
    }
}

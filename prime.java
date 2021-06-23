import java.util.*;
public class prime {
public static void main(String[] args)
{   
    Scanner inp = new Scanner(System.in); //scanner class
    int num=0;
   
    while(num!=101) { //to keep the loop running
    System.out.println("enter number to check if it is prime or not, enter 101 to exit");
    num=inp.nextInt();

    int mid = num/2,flag=0;
    if (num==0 | num==1) 
    {
            System.out.println(num + " is not prime");

    }
    else
    {
        for (int i = 2 ; i <= mid ; i++) //test condition to check prime
        {
            int check= num%i;
            if (check==0)
            {
                flag=1; //only if a divisor is found flag is 1 hence not prime
            }
        }
        
    }
    if(flag==1)
    {
      System.out.println(num + " is  not prime");

    }
    else
    {
              System.out.println(num + " is  prime");

    }
       
}
}
}

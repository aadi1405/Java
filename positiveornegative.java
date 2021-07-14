import java.util.*;
public class positiveornegative
{   public static void main(String[] args) 
{
    Scanner inp=new Scanner(System.in);
    System.out.println("Enter a number to check if +ve or -ve");

    int num=inp.nextInt();
    if (num>0)
    {    System.out.println(num + " is +ve ");

    }
     else if (num<0)
    {    System.out.println(num + " is -ve ");

    }
    else
       {   
           
           System.out.println(num + " is neither +ve nor -ve ");

        
    }
}
}

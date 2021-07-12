import java.util.*;
public class swapnumbers {

public static void main(String[] args)
{
    Scanner inp = new Scanner(System.in);
    //swapping two variables using a temporary variable temp
    int a,b,temp;
    System.out.println("Enter a:");
    a=inp.nextInt();
    
    System.out.println("Enter b:");
    b=inp.nextInt();
    
   System.out.println(" Before swapping, a is " + a + " and b is " + b);
   
   temp=a;
   a=b;
   b=temp;
   System.out.println(" After swapping, a is " + a + " and b is " + b);



}
}
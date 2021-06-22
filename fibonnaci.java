import java.util.*; //importing packages
public class fibonnaci
{
 public static void main(String[] args) //main function
{
    Scanner inp = new Scanner(System.in); // scanner class
    System.out.println("Enter the length of fibonnaci series");
    int n=inp.nextInt(); //inputing the length of the series
    int a0= 0, a1=1, a2; //declaring variables
    System.out.print(a0 + " " + a1); //printing first two values
    for (int i = 2; i <n ; i ++) // for loop to print rest of the values as per users series length 
    {
        a2= a0 + a1; //calculating next item
     System.out.print(" " + a2);  //printing 
     a0=a1; //changing the values of the numbers to be added to get next item
     a1=a2;
    }
    
}
}

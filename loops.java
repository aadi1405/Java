import java.util.*;
public class loops 
{
    public static void main(String[] args)   
    {   int count=0, count2=0;
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter string to repeat");
        String a=inp.nextLine();
        System.out.println("Enter the number of times to repeat");
        int n = inp.nextInt();
        //different loops
        System.out.println("Using for loop:");

        for (int i =0; i <n; i++) //forloop
        {
            System.out.println(a);
        }
        System.out.println("Using while loop:");
        while(count!=n) //while loop
        {
            System.out.println(a);
            count=count+1;

        }
        System.out.println("Using while loop:");

        do 
        {
         System.out.println(a);
         count2=count2+1;

        } while(count2!=(n));  //do while , it executes loop before checking condition 


    }
}
import java.util.*;
public class sumofnumbers
{
    public static void main(String[] args)
    {   int sum=0;
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter range  to sum (a to b, b inclusive) ");
        int a = inp.nextInt();
        int b = inp.nextInt();
        for (int i =a; i <=b ; i ++)
        {
            sum=sum+i;
        }
                System.out.println("The sum is " + sum);

    }
}

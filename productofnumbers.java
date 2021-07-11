import java.util.*;
public class productofnumbers 
{
    public static void main(String[] args)
    {   int product=1;
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter the range ");
        int a =inp.nextInt();
        int b = inp.nextInt();
        for (int i =a;i<=b;i++)
        {
            product= product*i;
        }
                System.out.println("The product is " + product);

    }
}

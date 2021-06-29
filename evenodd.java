import java.util.*;

public class evenodd {
public static void main(String[] args)
{
    Scanner inp=new Scanner(System.in);
    int num=0;
    while (num!=-1)
    {
    System.out.println("Enter a number, enter -1 to exit");
     num = inp.nextInt();
    if (num==-1)
    {
        break;
    }
    else if (num%2==0) //if remainder when divided by 2 gives 0, its even
    {
     System.out.println(num + " is an even number");   
    }
    else
    {
        System.out.println( num + " is an odd number");
    }
}
    
}
}



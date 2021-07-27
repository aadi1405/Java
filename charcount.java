import java.util.*;
public class charcount {
public static void main(String[] args)
{
    Scanner inp=new Scanner(System.in);
    System.out.println("Enter string");
    String a = inp.nextLine();
    System.out.println("Enter character to count");
    char b = inp.next().charAt(0);
    int c= a.length();
    int count =0;
    
    for (int i = 0 ; i <c ; i++)
    {
        if(a.charAt(i)==b)
        {
            count++;
        }
    }

    System.out.println("total count of " + b + " is "+ count);
}
}

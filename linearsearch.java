import java.util.*;

public class linearsearch
{
    public static void main(String[] args)
    {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter length of array");
        int n = inp.nextInt();
        int list[]= new int[n];
        for (int i=0; i<n; i++)
        {   System.out.println("enter the element" + (i+1) );
            list[i]= inp.nextInt();
            
        }
       
        System.out.println("Enter the element to find ");
        int key = inp.nextInt();
        for (int i =0 ; i < n ; i++)
        {
            if (list[i]==key)
            {
                System.out.println("the element was found in index" + i );
                
            }
            
        }
        
        
    }
}

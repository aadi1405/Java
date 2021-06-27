import java.util.*;
public class calculator 
{
    public static void main(String[] args)
    {   System.out.println("Welcome to a simple calculator");

        Scanner inp=new Scanner(System.in);
        
        String mode = "entry"; 
        while (mode!= "exit")
        {

        
        System.out.println("Enter first number");
        int a = inp.nextInt();
        System.out.println("Enter second number");
        int b = inp.nextInt();
        
        System.out.println("Enter option 1:add, 2:subtract, 3: multiply, 4:divide, 5:remainder 6: to exit ");

        int option=inp.nextInt();
        
        switch(option)
        {   
            case 1: System.out.println(a+b); break;
            case 2: System.out.println(a-b); break;
            case 3: System.out.println(a*b); break; 
            case 4: System.out.println(a/b); break; 
            case 5: System.out.println(a%b); break; 
            case 6: mode="exit";
        }
    }
    }
}

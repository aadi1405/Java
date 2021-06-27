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
        int a = inp.nextInt(); //input number1
        System.out.println("Enter second number");
        int b = inp.nextInt(); //input 2
        
        System.out.println("Enter option 1:add, 2:subtract, 3: multiply, 4:divide, 5:remainder 6: to exit ");

        int option=inp.nextInt();
        
        switch(option) //switch case which chooses depending on option value
        {   
            case 1: System.out.println(a+b); break; //add
            case 2: System.out.println(a-b); break; //subtract
            case 3: System.out.println(a*b); break; //multiply
            case 4: System.out.println(a/b); break;  //divide
            case 5: System.out.println(a%b); break; //remainder
            case 6: mode="exit"; //loop will fail
        }
    }
    }
}

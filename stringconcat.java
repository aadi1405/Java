import java.util.*;
public class stringconcat {
public static void main(String[] args)
{
    Scanner inp=new Scanner(System.in); //to take input from user 
    System.out.println("Enter two strings"); // try "ice" "cream"
    String a = inp.nextLine();
    String b = inp.nextLine();
    System.out.println(a + b); // one way to append
    System.out.println(a.concat(b));  //method2
    System.out.println("the above used two different methods to concat the strings!!");
    
}
}
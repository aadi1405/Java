import java.util.*;
public class id
{
    public static void main(String[] args)
    {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter id");
        // bpdc format : Yearofentry(4)stream(2) ps or thesis(2) roll no.4 "U" (stands for UG)
        // the bracket numbers refer to the number of characters each detail takes
        String m= inp.nextLine();
        int length = m.length();
      
         System.out.println("the year of entry is " + m.substring(0,4));
           System.out.println("the stream is " + m.substring(4,6));
            System.out.println("you have taken " + m.substring(6,8));
            System.out.println("roll no. is " + m.substring(8,12));
    }
}
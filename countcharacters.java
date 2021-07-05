import java.util.*;
public class countcharacters 
{  
    public static void main(String[] args)
    { 
        int b=1;
        int count=0; //initially 0 characters
       
        Scanner inp= new Scanner(System.in);
        System.out.println("Enter string(s), or type 'end' to exit");
        String a = inp.nextLine(); //inputting a string
        count=0;
        for (int i =0; i <a.length(); i++)
        {
            if(a.charAt(i)!=' ') //space is not counted as character
            {
                count+=1; //incrementing count value for everyy character except space
                
            }
        }
        
        
        System.out.println(count + " characters ");
        
    
    }
}

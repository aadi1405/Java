import java.util.*;
public class pattern1   
{   
public static void main(String args[])   
{   
Scanner inp = new Scanner(System.in);
System.out.println("Enter the number of rows");
int n= inp.nextInt();   
 
for(int i=0; i<n; i++)   
{   

for(int j=0; j<=i; j++)   
{   

System.out.print("* ");   
}   
System.out.println();   
}   
}   
}  
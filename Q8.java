import java.util.Scanner;
public class Q8 {
    public static void main(String args[])
    {
        Scanner src=new Scanner(System.in);
        int year=src.nextInt();
        if ((year%4==0 && year%100!=0 )||(year%400==0))
        {System.out.println("LEAP YEAR");
        
    }
     else
       {
        System.out.println("NOT LEAP YEAR");
       }


    }
    
}

import java.util.Scanner;
public class Q12 {
    public static void main(String args[]) {
        Scanner src=new Scanner(System.in);
        System.out.println("Input 1st Number : ");
        float a=src.nextFloat();
        System.out.println("Input 2nd Number : ");
        float b=src.nextFloat();
        System.out.println(" 1 <= Choice <= 4 ....Input +(1) Or -(2) Or *(3) Or /(4) : ");
        int c=src.nextInt();
           switch (c)
        {
            case 1:
            System.out.println("Addition: "+(a+b));
            case 2:
            System.out.println("subtraction: "+(a-b));  
            case 3:     
            System.out.println("Multiplication: "+(a*b));
            case 4:
            if(b==0)
            {
                System.out.println("Zero as divisor is not valid!");
            }
            else
            System.out.println("Quotient: "+(a/b));

        }

        
    }
    
}
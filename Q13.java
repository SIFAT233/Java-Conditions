import java.util.Scanner;
public class Q13 {
    public static void main(String args[]) {
        Scanner src=new Scanner(System.in);
        System.out.println("Input 1st Number : ");
        float a=src.nextFloat();
        System.out.println("Input 2nd Number : ");
        float b=src.nextFloat();
        System.out.println("1.Addition.\n2.Subtraction.\n3.Multiplication.\n4.Division.");
        int c=src.nextInt();
           switch (c)
        {
            case 1:
            System.out.println("Addition: "+(a+b));
            break;
            case 2:
            System.out.println("subtraction: "+(a-b));  
            break;
            case 3:     
            System.out.println("Multiplication: "+(a*b));
            break;
            case 4:
            System.out.println("1.Quotient.\n2.Remainder.");
            int k=src.nextInt();
            if(b==0)
            {
                System.out.println("Zero as divisor is not valid!");
            }
            else{
            switch(k)
            {
                case 1:
                System.out.println("Quotient: "+(a/b));
                break;
                case 2:
                System.out.println("Remainder: "+(a%b));
            }
        }
            

        }

        
    }
    
}
import java.util.Scanner;
import javax.lang.model.util.ElementScanner14;
public class Q7 {
    public static void main(String[] args) {
        Scanner src=new  Scanner(System.in); 
        int a=src.nextInt();
        int b=src.nextInt();
        if(a>b)
        {
            System.out.printf("%d is bigger than %d",a,b);
        }
        else if(a<b)
        {
            System.out.printf("%d is smaller than %d",a,b);
        }
        else 
        {
            System.out.println("Both are equal");
        }
    }
    
}

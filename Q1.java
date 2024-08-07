import java.util.Scanner;
public class Q1 {
    public static void main(String args[]){
        Scanner src=new Scanner(System.in);
        float a=src.nextFloat();
        if(a>0)
        {
            System.out.println("Positive");
        }
        else if(a<0){
            System.out.println("Negative");
        }
        else 
        {
            System.out.println("Zero");
        }

    }
    

}

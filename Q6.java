import java.util.Scanner;
public class Q6 {
    public static void main(String args[]){
        Scanner src=new Scanner(System.in);
        int a=src.nextInt();
        if(a>0){

        if(a>0 && ((a& a-1) == 0))
        {
            System.out.println("Yes");
        }
    }
        else if (a==0)
        {
            System.out.println("Zero is not a valid input");
        }
        else if(a<0)
        {
            System.out.println("Negative input is not valid");
        }
    

        else
            System.out.println("No");
    }
}
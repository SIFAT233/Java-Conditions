import java.util.Scanner;
public class Q5 {
    public static void main(String args[]){
        Scanner src=new Scanner(System.in);
        int a=src.nextInt();
        if(a>0 && ((a& a-1) == 0))
        {
            System.out.println("Yes");
        }
        else
            System.out.println("No");
    }
}

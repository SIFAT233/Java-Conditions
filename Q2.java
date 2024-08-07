import java.util.Scanner;
public class Q2 {
    public static void main(String args[]){
    Scanner src=new Scanner(System.in);
    System.out.println("Input a number:");
    float a=src.nextFloat();
    if(a%2==0){
    System.out.println("Even");
    }
    else if(a%2!=0){
        System.out.println("Odd");
    }

    }
}

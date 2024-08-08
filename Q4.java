import java.util.Scanner;
public class Q4 {
    public static void main(String args[]){
        Scanner src=new Scanner(System.in);
        int a=src.nextInt();
        int b=src.nextInt();
        int c=src.nextInt();
        if(0<a && a<180 && 0<b&&b<180 && 0<c && c<180 && (a+b+c==180) )
        {
            System.err.println("Yes");
        }
        else 
        System.out.println("NO");
    }
    
}

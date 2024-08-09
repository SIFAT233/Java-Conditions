import java.util.Scanner;
public class Q9 {
    public static void main(String args[]){
    Scanner src=new Scanner(System.in);
    char a=src.next().charAt(0);
    if( (a>='A' && a<='Z') || (a>='a' && a<='z') )
    {
        System.out.println("Alphabet");

    } 
    else if (a>=0  ||  a<=9)
    {
        System.out.println("Number");
    }
    else
      {
        System.out.println("Charecter");
      }
}
}

import java.util.Scanner;
public class Q11 {
    public static void main(String args[]) {
        Scanner src=new Scanner(System.in);
        float a=src.nextFloat();
        if (a>=90 && a>=100) {
            System.out.println("A");
        }
        else if(a>=86 && a<=89){
            System.out.println("A-");
        }
        else if(a>=82 && a<=85){
            System.out.println("B+");
        }
        else if(a>=78 && a<=81){
            System.out.println("B");
        }
        else if(a>=74 && a<=77){
            System.out.println("B-");
        }
        else if(a>=70 && a<=73){
            System.out.println("C+");
        }
        else if(a>=66 && a<=69){
            System.out.println("C");
        }
        else if(a>=62 && a<=65){
            System.out.println("C-");
        }
        else if(a>=58 && a<=61){
            System.out.println("D+");
        }
        else if(a>=55 && a<=57){
            System.out.println("D");
        }
        else{
            System.out.println("F");
        }

        
    }
    
}

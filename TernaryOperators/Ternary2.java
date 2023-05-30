import java.util.Scanner;

public class Ternary2 {
    public static void main(String[] args) {
        System.out.println("enter a,b,c values: ");
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        System.out.print("the largest no is: ");
        int r=(a>b)?(a>c?a:c):(b>c?b:c);
        System.out.println(r);

    }
}

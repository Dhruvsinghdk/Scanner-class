import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        System.out.println("Enter x :");
        String  x = n.nextLine();
        System.out.println("Enter y :");
        String  y = n.nextLine();
        String z = x+y;
        System.out.println("Sum = "+z);
        System.out.println(x);
    }
}
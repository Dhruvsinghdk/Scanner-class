import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        System.out.println("Enter x :");
        int x = n.nextInt();
        System.out.println("Enter y :");
        int y = n.nextInt();
        int z = x+y;
        System.out.println("Sum = "+z);
    }
}
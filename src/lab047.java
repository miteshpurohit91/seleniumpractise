import java.util.Scanner;

public class lab047 {

    public static void main(String[] args) {

        // Take input from user
        // Need to use Scanner class
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number, i will tell number is Odd or Even");
        int a = sc.nextInt();

       // int a =34;
        if (a%2==0)
        {
            System.out.println("even number");
        }
        else
        {
            System.out.println("Odd number");
        }
    }
}

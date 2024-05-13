import java.util.Scanner;

public class lab048 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a & b");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a>b){
            System.out.println("a is max number");
        }
        else {
            System.out.println("b is max number");
        }

    }
}

import java.util.Scanner;

public class lab052 {
    public static void main(String[] args) {
        //Triangle clasifier

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Side value");
        int side1 = sc.nextInt();
        int side2 = sc.nextInt();
        int side3 = sc.nextInt();

        if ((side2 == side3) && (side1 == side3))
        {
            System.out.println("This Triangle is eq.");
        }
        else if ((side1 == side2) || (side2 == side3) || (side1 == side3))
        {
            System.out.println("This Triangle is ISO.");
        }
        else
        {
            System.out.println("This Triangle is Scalene.");
        }

    }
}

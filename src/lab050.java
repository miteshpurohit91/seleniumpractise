import java.util.Scanner;

public class lab050 {
    public static void main(String[] args) {
        // Grade Calculator
        //Input from user
        // Score (Data type) -> int -> Grade (Char or String)

        // Basic logic
        // If score >= 90 && score <= 100 -> Print A
        //if score >=80 && score <=89 -> Print B

        // Write real code

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student Marks");
        int score = sc.nextInt();

            if ( score >= 90 && score<= 100 ) {
            System.out.println("Your Grade is A");
        }
            else if (score >=80 && score <=89) {
                System.out.println("Your Grade is B");
            }
            else if (score >=70 && score <=79) {
                System.out.println("Your Grade is C");
            }
            else if (score >=60 && score <=69) {
                System.out.println("Your Grade is D");
            }
            else {
                System.out.println("Your Grade is F");
            }
        //Debug code: If input is other than integer than code is fails. we can fix it by future class.
    }
}

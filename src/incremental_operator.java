public class incremental_operator {
    public static void main(String[] args) {

        // Increment Operator
        int a = 10;
        System.out.println(++a + a++ + a++ );
        System.out.println(a);
        // Part A (Exp = 10, a=11) -> ++a -> o/p -> 11
        // Part B (Exp = 11, a=12) -> a++ -> o/p -> 11
        // Part C (Exp = 12, a=13) -> a++ -> o/p -> 12
        // A+B+C = 34, a=13

        // Decrement Operator
        int b = 10;
        System.out.println((--b + b--));
        System.out.println(b);
        // (9+9=18)
        // (8)
        int c = 10;
        System.out.println(--c + c++ + ++c);
        System.out.println(c);
        // (9+9+11=29)
        //11
    }
}

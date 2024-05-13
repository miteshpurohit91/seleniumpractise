public class lab022 {
    public static void main(String[] args) {
        String s1 = "Hello";
        System.out.println(s1 instanceof String);
        System.out.println(s1 instanceof Object);

        // Condition Ternary Operator
        //int a = condition ? if the condition is true do this : else do this

        int a = true ? 10:20;
        int b = (30>40) ? 10:20;
        System.out.println(a);
        System.out.println(b);
    }
}

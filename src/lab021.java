public class lab021 {
    public static void main(String[] args) {

        // Practise to understand difference between String Constant Pool and Object Area
        String name = "Mitesh Purohit"; // String Constant Pool Area
        String name1 = "Mitesh Purohit"; // Object Area
        String name2 = new String("Mitesh Purohit");

        System.out.println(name == name2);
        System.out.println(name == name1);
        System.out.println(name.equals(name2));
        System.out.println(name.equalsIgnoreCase(name2));

        // String Concat

        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1.concat( str2);
        System.out.println(str3);
    }
}

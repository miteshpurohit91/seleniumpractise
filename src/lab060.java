public class lab060 {
    public static void main(String[] args) {
        //jdk > 13
        int itemcode = 002;
        switch(itemcode){
            case 001,002,003 -> System.out.println("it's an electronics gadget");

            case 004,005 -> System.out.println("It's a Mechanical");

            default -> System.out.println("it's a software product");

        }
    }
}

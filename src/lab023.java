public class lab023 {
    public static void main(String[] args) {

        int a = 50;
        int b = 60;
        int c = 20;

        int max = (a>b) ? ((a>c)? a:c) : ((b>c)? b:c);
        System.out.println(max);
    }

}


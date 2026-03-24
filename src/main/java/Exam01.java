import java.util.Scanner;

public class Exam01 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int a;
        int b;


        a = s.nextInt();
        b = s.nextInt();

        double result = (double) a / b;

        System.out.println(a + " / " + b + " = " + result);

        s.close();
    }
}





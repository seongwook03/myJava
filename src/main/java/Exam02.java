import java.util.Scanner;

public class Exam02 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        String a = s.next();
        String b = s.next();

        String c = a + b;

        String result = c.toLowerCase();
        result = result.replaceAll(" ","");

        System.out.println(result);

        s.close();








    }

}

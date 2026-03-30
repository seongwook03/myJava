import java.util.Scanner;

public class Exam02 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        String a;
        a = s.nextLine();


        String result = a.toLowerCase().replaceAll(" ","");


        System.out.println(result);

        s.close();








    }

}

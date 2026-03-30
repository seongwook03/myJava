import java.util.Scanner;

public class Code04_11 {
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);

        String a, b;
        int c;

        System.out.println("첫번쨰 문자열 ==> ");
        a = s.nextLine();
        System.out.println("두번째 문자열 ==> ");
        b = s.nextLine();

        c = a.length() - b.length();
        System.out.println("두 문자열 길이차이 ==> " + c + "입니다");
        s.close();

    }
}

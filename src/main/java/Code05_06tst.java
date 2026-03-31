import java.util.Scanner;

public class Code05_06tst {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();

        if ( a % 3 == 0)
        {
            if ( a % 5 == 0)
            {
                System.out.println("3과 5의 배수 둘다 만족합니다");
            } else {
            System.out.println("3의 배수입니다.");}
        } else {
            System.out.println("5의 배수입니다.");
        }
        s.close();

    }
}

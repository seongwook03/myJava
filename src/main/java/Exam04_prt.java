public class Exam04_prt {
    public static void main(String[] args) {

        for (int a = 1; a <= 7; a++) {

            int s;
            if (a <= 4) {
                s = a;
            } else {
                s = 8 - a;
            }

            for (int b = 1; b <= s; b++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

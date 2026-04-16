import java.util.Scanner;

public class Weektest02_01 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int year;
        int month;

        year = s.nextInt();
        month = s.nextInt();

        int day;
        if (month == 2) {
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                day = 29;
            } else {
                day = 28;
            }
        }else if (month == 4 || month == 6 || month == 9 || month == 11) {
            day = 30;
        } else
            day = 31;

        System.out.print(day);
    }
}




public class Code06_15 {
    public static void main(String[] args) {
        int hap = 0;
        for (int i=1; i<=100; i++) {
            if (i % 4 == 0) {
                continue;
            }
                hap += i;
        }
    }
}


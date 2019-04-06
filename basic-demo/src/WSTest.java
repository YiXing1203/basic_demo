public class WSTest {
    public static void main(String[] args) {
        for (int m = 2; m < 1000; m++) {
            int s = 0;
            for (int i = 1; i < m; i++) {
                if (m % i == 0) {
                    s += i;
                }
            }
            if (m == s) {
                System.out.print(m+"是完数,其因子为: ");
                for (int j = 1; j < m; j++) {
                    if (m % j == 0) {
                        System.out.print(j+" ");
                    }
                }
                System.out.println();
            }
        }

    }
}

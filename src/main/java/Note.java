public class Note {
    public static void main(String[] args) {
            int i, j, k;
            k = 3;
            for (i = 1; i <= 5; i++) {//1~5까지
                for (j = 1; j <= 5; j++) {
                    if (j < k) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
                if (j < k) {
                    k--;
                } else {
                    k++;
                }
            }
        }
    }
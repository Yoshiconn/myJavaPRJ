public class Note {
    public static void main(String[] args) {
        int i, j, k;
        k = 1;
        for (i = 0; i <= 5; i++) {//1~5까지
            for (j = 1; j < 6; j++) {
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
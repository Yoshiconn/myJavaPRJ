public class Note {
    public static void main(String[] args) {
        int space = 2;
        int a = 1;
        int flag = 0;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= a; j++) {
                System.out.print("*");
            }
            if (flag == 0) {
                space--;
                a += 2;
            } else {
                space++;
                a -= 2;
            }
            if (space == 0) {
                flag = 1;
            }
            System.out.println();
        }
    }
}
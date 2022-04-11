import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j, st, end;
        System.out.print("홀수 값을 입력 해주세요. : ");
        int all = sc.nextInt();
        st = 1;
        end = all;

        if (all%2==0) {
            System.out.println("홀수 값을 입력 해주세요.");
        }
        else {
            for (i = 1; i <= all; i++) {
                for (j = 1; j <= end; j++) {
                    if (j < st) {
                        System.out.print(" ");
                    } else if (j <= end) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
                if (i < all / 2 + 1) {
                    st++;
                    end--;
                } else {
                    st--;
                    end++;
                }
            }
        }
    }
}

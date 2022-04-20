import java.util.Scanner;

public class ex_0421 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int hap = 0;

        for(int i = 1; i <= a; i++) {
            if(i%3 == 0 || i%7 == 0 || i%11==0) {
            } else {
                hap += i;
            }
        }
        System.out.print(hap);
    }
}

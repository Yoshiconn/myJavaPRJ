import java.util.Scanner;

public class ex04_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int end = 100;
        int result = 0;
        int st = sc.nextInt();
        while (true) {
             if(st != end) {
                 result += st;
                 st++;
             } else {
                 System.out.print(result);
                 break;
             }
        }
    }
}

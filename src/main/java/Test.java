import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a, b=0;

        a = sc.nextInt();

        for(int i = 0; i <= a; i++){
            b += i;
        }
        System.out.printf("%d", b);
    }
}

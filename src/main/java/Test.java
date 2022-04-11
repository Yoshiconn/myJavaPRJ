import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a, b=0;

        a = sc.nextInt();

        for(int i = 1; i < a+1; i++){
            System.out.printf("*");
            for(int n = 1; n < a; n++){
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}

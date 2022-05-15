import java.util.Scanner;

public class sadsadas {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int hap = 0;

        int[] aa = new int[10];

        for (int i = 1; i < 10; i++) {
            aa[i] = sc.nextInt();
            hap = aa[i]*i;
            System.out.printf("%d * %d = %d \n", aa[i],i,hap);
        }
    }
}

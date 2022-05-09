import java.util.Scanner;

public class sadsadas {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int hpa = 0;
        int i = 1;
        int[] aa = new int[10];

        while (i < 10) {
            aa[i] = sc.nextInt();
            hpa = aa[i]*i;
            System.out.printf("%d * %d = %d \n", aa[i],i,hpa);
            i++;
        }
    }
}

import java.util.Scanner;

public class sadsadas {
    public static void maim(String[] args){
        Scanner sc = new Scanner(System.in);
        int hpa = 0;
        int i = 1;
        int a = sc.nextInt();

        while (i < 10) {
            hpa = a*i;
            System.out.printf("%d * %d = %d \n", a,i,hpa);
            i++;
        }
    }
}

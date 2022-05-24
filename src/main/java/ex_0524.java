import java.util.Scanner;

public class ex_0524 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[11];

        for(int i = 1; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int num = sc.nextInt();

        System.out.println(arr[num]);

    }
}
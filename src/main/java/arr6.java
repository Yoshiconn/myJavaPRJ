import java.util.Arrays;
import java.util.Scanner;

public class arr6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr = new int[a];

        for (int j = 0; j < arr.length; j++) {
            arr[j] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(arr[0]);
    }
}
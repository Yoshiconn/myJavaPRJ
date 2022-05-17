import java.util.Arrays;
import java.util.Scanner;

public class ex_05_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(arr[8]);
        int maxNum = arr[arr.length-1];
        System.out.println("--------------------------");
        for(int i : arr) {
            System.out.println("i : " +  i);
        }
        System.out.print(maxNum);
    }
}
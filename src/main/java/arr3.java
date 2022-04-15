import java.util.Scanner;

public class arr3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int sum = 0;
            float avg = 0;
            int a = sc.nextInt();

            int[] arr = new int[a];

            for(int i = 0; i<a; i++){
                arr[i] = sc.nextInt();

                sum += arr[i];
        }
            avg = sum / a;
            System.out.printf("총점은? :  " + sum);
            System.out.printf("평균점수는? :  " + avg);

    }
}

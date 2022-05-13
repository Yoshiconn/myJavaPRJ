import java.util.Scanner;

public class ex0513 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        float avg = 0;
        System.out.print("과목 수를 입력해주세요. : ");
        int a = sc.nextInt();

        int[] arr = new int[a];
        int sub = 1;

        for(int i = 0; i<a; i++){
            System.out.printf("%d 번째의 과목 점수를 입력하세요. : ", sub);
            arr[i] = sc.nextInt();
            sub ++;

            sum += arr[i];
        }
        avg = sum / a;
        System.out.printf("총점은? :  " + sum + "\n");
        System.out.printf("평균점수는? :  " + avg);

    }
}

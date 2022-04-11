import java.util.Scanner;

public class Note {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); //줄을 찍고
        int a = s.nextInt(); //외부조건
        int b = a;

        for (int i = 0; i < (a*2)-1; i++) {
            for ( int j = 0; j < b*2; j++) {
                if (j <= i) {
                    System.out.print("*");
                    System.out.print(j);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            b--;
            System.out.print(b);
        }
    }
}
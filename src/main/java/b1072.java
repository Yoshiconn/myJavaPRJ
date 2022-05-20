import java.util.Scanner;

public class b1072 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str;

        str = sc.nextLine();
        int answer = mainLosic(str);
        System.out.println(answer);
    }
    public static int mainLosic(String str) {
        String strAry[];
        if (str.equals("")) {
            System.out.println(0);
            return 0;
        } else if (str.equals(" ")) {
            System.out.println(0);
            return 0;
        } else {

            str = str.trim();

            strAry = str.split(" ");
            return strAry.length;

        }
    }
}
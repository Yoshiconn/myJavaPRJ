import java.util.Scanner;

public class Note {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str, strAry[];

        str = sc.nextLine();

        if (str.equals("")) {
            System.out.println(0);
            return;
        } else if (str.equals(" ")) {
            System.out.println(0);
        } else {

            str = str.trim();

            strAry = str.split(" ");


            System.out.println(strAry.length);

        }
    }
}
import java.util.Scanner;

public class Note {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String c = sc.next();

        char[] d = a.toCharArray();
        char[] e = b.toCharArray();
        char[] f = c.toCharArray();

        if (d[0] == f[f.length - 1]) {
            System.out.println("good");
        } else if (e[0] == d[d.length - 1]) {
            System.out.println("bad");
        } else if (f[0] == e[e.length - 1]) {
            System.out.println("bad");
        } else
            System.out.println("bad");
    }
}
import java.util.Scanner;

public class codeup_0602{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String[] arr = s.split("");
        int c1 = 0;
        int c2 = 0;

        for (int i=0; i<arr.length; i++) {
            if (arr[i].charAt(0)=='c' || arr[i].charAt(0)=='C') {
                c1++;
            }
        }
        for (int i=0; i<arr.length-1; i++) {
            if ("cc".equalsIgnoreCase(arr[i]+arr[i+1])) {
                c2++;
            }
        }
        System.out.println(c1);
        System.out.println(c2);
    }
}

import java.util.Scanner;

public class butterfly2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int st = 1;
        int end = num*2;

        for (int i = 1; i <= (num*2); i++ ){
            for(int j = 1; j <= (num*2); j++){
                if(j > st && j < end){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
            if(i < num){
                st++;
                end--;
            } else {
                st--;
                end++;
            }
        }
    }
}

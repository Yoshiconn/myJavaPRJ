import java.util.Arrays;
import java.util.Collections;

public class arr4 {
    public static void main(String[] args) {
        int[] score = {26, 20, 44, 54, 30, 40, 98, 37};
        Integer[] score2 = {26, 20, 44, 54, 30, 40, 98, 37};

        Arrays.sort(score);

        for(int i = 0; i < score.length; i++) {
            System.out.println("정렬된 " +i+"번지의 값은? : "+score[i]);
        }
        System.out.println();

        Arrays.sort(score2, Collections.reverseOrder());
        for(int i = 0; i <  score2.length; i++){
            System.out.println("정렬된"+i+"번지 값은? : "+score2[i]);
        }
    }
}

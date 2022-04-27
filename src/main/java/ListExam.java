import java.util.ArrayList;
import java.util.List;

public class ListExam {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>(); // 무조건 외우기 구조 무조건 외우기

        // List 객체에 데이터 추가하기
        list.add("ㄱㄱㄱ");
        list.add("ㄴㄴㄴ");
        list.add("ㄷaㄷ");
        list.add("ㄷsㄷ");
        list.add("ㄷdㄷ");
        list.add("ㄹㄹㄹ");

        //List의 데이터 수 구하기
        int listSize = list.size();

        // List 객체에 저장된 값 출력하기
        // 여러 데이터가 저장되기 때문에 내용을 확인하려면 반복문 사용.

        for(int i = 0; i < listSize; i++) { // 구식이고 속도가 느림.
            System.out.println("이름 : " + list.get(i));
        }
    }
}

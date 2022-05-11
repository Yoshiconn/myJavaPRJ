import java.util.ArrayList;
import java.util.List;

public class ddddasdsa {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        // List 객체에 데이터 추가하기
        list.add ("ㅁㄴㅇㄹ");
        list.add ("asdasd");
        list.add ("wwewqwewqe");
        list.add ("2321312312");


        //List의 데이터 수 구하기
        int listSize = list.size();

        // List 객체에 저장된 값 출력하기
        // 여러 데이터가 저장되기 때문에 내용을 확인하려면 반복문 사용.

        for(int i = 0; i < listSize; i++) { // 구식이고 속도가 느림.
            System.out.println("이름 : " + list.get(i));
        }
    }
}

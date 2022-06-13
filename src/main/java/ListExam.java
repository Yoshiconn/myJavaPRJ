import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExam {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>(); // 무조건 외우기 구조 무조건 외우기

        // List 객체에 데이터 추가하기
        list.add("ㄱㄱㄱ");
        list.add("ㄴㄴㄴ");
        list.add("ㄷㄷㄷ");
        list.add("ㄹㄹㄹ");
        list.add("ㅁㅁㅁ");
        list.add("ㅂㅂㅂ");

        //List의 데이터 수 구하기
        int listSize = list.size();

        // List 객체에 저장된 값 출력하기
        // 여러 데이터가 저장되기 때문에 내용을 확인하려면 반복문 사용.

        for(int i = 0; i < listSize; i++) { // 구식이고 속도가 느림.
            System.out.println("이름 : " + list.get(i));
        }
        //  foreach   //   for (String name : list) { // 문법은 다음과 같음
//            System.out.println("이름 : " + name);

//  람다식  list.forEach(name -> System.out.println("name : " +name));
        // 람다식 가장 빠르나 비동기식 방식이고 순서가 바뀔수도 있다.

        /* Iterator를 활용한 방법임 -> 옛날에 많이씀*/
        Iterator<String> it = list.iterator();

        while (it.hasNext()) {
            String name = it.next();
            System.out.println("이름 : " + name);
        }

    }
}


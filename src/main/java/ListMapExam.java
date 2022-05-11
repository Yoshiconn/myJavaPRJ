import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListMapExam {
    public static void main(String[] args) {

        List<Map<String, String>> list = new ArrayList<>();

        Map<String, String> map = new HashMap<>();

        // 정보 저장하기
        map.put("name", "양주홍"); // name라는 키와 양주홍 이라는 값
        map.put("email", "jerry742@naver.com");
        map.put("addr", "경기");
        map.put("dept", "데이터분석과");

        list.add(map); // 등록한 정보를 list에 저장하기

        map = null; // 메모리에 데이터를 지우는 방식으로 등록한 정보를 삭제하기


        // 기존 map 객체의 값을 새롭게 생성하기
        map = new HashMap<>(); // map = null 해서 메모리에서 날렸으니 다시 메모리에 올림

        // 정보 저장하기2
        map.put("name", "요시콘");
        map.put("email", "yoshicon0630@naver.com");
        map.put("addr", "몰?루!");
        map.put("dept", "몰?루");

        list.add(map); // 등록한 정보를 list에 저장하기

        map = null; /* 메모리에 데이터를 지우는 방식으로 등록한 정보를 삭제하기
        다쓴 변수는 null로 처리해 줄것
        */

        //list 데이터 수 구하기
        int listSize = list.size();

        // List 객체에 저장된 값 출력하기
        // 여러 데이터가 저장되기 때문에 내용을 확인하기 위해서는 반복문을 사용함

        // 지난 시간에 배운 for문으로 출력하는 방법법
        for (int i =  0; i < listSize; i++) { // 배열의 인덱스 번호는 0부터 시작작


           Map rMap = list.get(i);
            System.out.println("name : " + rMap.get("name"));
            System.out.println("email : " + rMap.get("email"));
            System.out.println("adrr : " + rMap.get("addr"));
            System.out.println("dept : " + rMap.get("dept"));

            System.out.println("-------------------------------------");
        }
    }
}

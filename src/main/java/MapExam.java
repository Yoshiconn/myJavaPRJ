import java.util.HashMap;
import java.util.Map;

public class MapExam {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();

        // 값 저장하는법
        map.put("name", "양주홍");
        map.put("email", "jerry742@naver.com");
        map.put("dept", "데이터분석과");

        // 값 불러오는법
        System.out.println("---------------------------------------------------");

        System.out.println("name : " + map.get("name"));
        System.out.println("email : " + map.get("email"));
        System.out.println("dept : " + map.get("dept"));
        System.out.println("name :" + map.get("name1")); // <- name1로 오타낸다면 null이란 값이 출력

        System.out.println("---------------------------------------------------");
    }
}

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ex05_18 {
    public static void main(String[] args) {

        List<Map<String, String>> list = new ArrayList<>(); // 데이터 타입을 명시하기 위해 꺽쇠 <> 사용
        /*List 에<Map<키 , 벨류 > 변수명 = new <- 메모리에 올린다 어떻게? ArrayList<>();로  */
        /*List list = new ArrayList<Map<String, String>>(); <- 이렇게 꺽쇠를 뒤에 써도 되나 상관없음 */

        Map<String, String> map = new HashMap<>(); // map 메모리에 올림

        map.put("name", "123"); //map name 추가
        map.put("email", "email");// map dept 추가
        map.put("addr", "addr");// map dept 추가
        map.put("dept", "dept");// map dept 추가

        list.add(map); // list 에 map 추가

        map = null; // 메모리에 있는 map의 데이터를 지움 왜냐 이미 map을 list에 저장했고 필요없기 때문

        map = new HashMap<>(); // 다시 map을 메모리에 새로 올림

        map.put("name", "456"); //map name 추가
        map.put("email", "email");// map dept 추가
        map.put("addr", "addr");// map dept 추가
        map.put("dept", "dept");// map dept 추가

        list.add(map); // 위에 있는 데이터 홍길동 정보를 list에 저장

        map = null;

        for (Map<String, String> rMap : list)  {
            System.out.println("name : " + rMap.get("name"));
            System.out.println("name : " + rMap.get("email"));
            System.out.println("name : " + rMap.get("addr"));
            System.out.println("name : " + rMap.get("dept"));
        }

    }
}

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EX_0623 {
    public static void main(String[] args) {

        List<Map<String, String>> list = new ArrayList<>();

        Map<String, String> map = new HashMap<>();

        map.put("name", "양주홍");
        map.put("email", "jerry742@naver.com");
        map.put("addr", "경기");
        map.put("dept", "데이터분석과");

        list.add(map);

        map = null;

        map = new HashMap<>();

        map.put("name", "요시콘");
        map.put("email", "yoshicon0630@naver.com");
        map.put("addr", "몰?루!");
        map.put("dept", "몰?루");

        list.add(map);

        int listSize = list.size();


        for (int i =  0; i < listSize; i++) {


            Map rMap = list.get(i);
            System.out.println("name : " + rMap.get("name"));
            System.out.println("email : " + rMap.get("email"));
            System.out.println("adrr : " + rMap.get("addr"));
            System.out.println("dept : " + rMap.get("dept"));

            System.out.println("-------------------------------------");
        }
    }
}
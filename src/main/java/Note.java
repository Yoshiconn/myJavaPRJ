import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Note {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("123");
        list.add("456");
        list.add("789");
        list.add("101");

        Iterator<String> it = list.iterator();

        while (it.hasNext()) { // while 문으로 조회하는 방법 *** N 은 대문자임!
            String name = it.next();
            System.out.println("이름 : " + name);
        }
        for (String name : list) { // Foreach문
            System.out.println("이름 : " + name);
        }
        list.forEach(name -> System.out.println("name : " + name)); // 람다식 비동기식 방식,순서가 바뀔수 있으며 프레임 워크 에서만 사용가능능
    }
}
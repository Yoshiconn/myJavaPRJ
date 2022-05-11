import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex05_11list {
    public static void main(String[] args){
        List<String> list = new ArrayList<>(); // 0518 쪽지 시험임 무조건 밑에거 외우기 외우기

        list.add("123");
        list.add("456");
        list.add("789");

//  foreach   //   for (String name : list) { // 문법은 다음과 같음
//            System.out.println("이름 : " + name);

//  람다식   //   list.forEach(name -> System.out.println("name : " +name));
          // 람다식 가장 빠르나 비동기식 방식이고 순서가 바뀔수도 있다.

/* Iterator를 활용한 방법임 -> 옛날에 많이씀*/
        Iterator<String> it = list.iterator();

        while (it.hasNext()) {
            String name = it.next();
            System.out.println("이름 : " + name);
        }

    }
}

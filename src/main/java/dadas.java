import java.util.ArrayList;
import java.util.List;

public class dadas {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("ㅁㄴㅇㄹ");
        list.add("ㅁㄴㅇㅇㄹ");
        list.add("ㅁㄴㅇㄹㄹ");
        list.add("ㅁㄴㄹㅇㄹ");
        list.add("ㅁㄴㅇㄴㄹ");

        int listsize = list.size();

        for(int i = 0; i < listsize; i++) {
            System.out.println("이름 : " + list.get(i));
        }
    }
}
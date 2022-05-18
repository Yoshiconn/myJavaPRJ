public class Ex09_04 {
    public static void main(String[] args) {
        String str = "Java를 공부하는 중, Java는 재밌어요.^^";

        System.out.println("문자열 ==>" + str);

        System.out.print("제일 처음에 나오는 Java 위치 ==> ");
        System.out.println(str.indexOf("Java")); // 앞에서 부터 카운터 하는게 indexOf

        System.out.print("마지막에 나오는 Java 위치 ==> ");
        System.out.println(str.lastIndexOf("Java")); // 뒤에서 부터 카운트 하는게 lastIndexOf
    }
}

public class Ex09_08 {
    public static void main(String[] args) {
        String str1 = "Java Programming";
        String str2 = "Java IT CookBook";

        System.out.println("원 문자열1 ==> [" + str1 + "]");
        System.out.println("원 문자열2 ==> [" + str2 + "]");

        System.out.println(str1.compareTo(str2)); // <== 이건 그냥 개념만 알기 값이 같냐 안같냐 비교만 하는거
        System.out.println(str1.contains("Java")); // Java 가 존재 하냐 안하냐 에 따라 true false 값 리턴
        System.out.println(str1.indexOf("Java")); // Java 가 존재하는 위치 값 리턴
        System.out.println(str1.indexOf("Java") > -1);  // 많이 쓰는 방식임
    }
}

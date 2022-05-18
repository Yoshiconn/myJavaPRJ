public class Ex09_06 {
    public static void main(String[] args) {
        String str = "   한글    ABCD    efgh    ";

        System.out.println("원 문자열 ==> [" + str + "]");
        System.out.println("대문자로 ==> [" + str.toUpperCase() + "]");
        System.out.println("소문자로 ==> [" + str.toLowerCase() + "]");
        System.out.println("공백제거 ==> [" + str.trim() + "]"); // 시작 포인트와 끝 포인트 쪽에 있는 공백을 제거해줌 즉, 앞 뒤만
        System.out.println("전체공백제거 ==> [" + str.replaceAll( " ", "") +"]"); //replaceAll 전체 바꾼다 뭐를 공백 " " 을 없앤다. 따로 특수문자나 요론것도 빼는게 가능
    }
}

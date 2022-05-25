public class Ex09_09 {
    public static void main(String[] args) {

        String str1 = "Java Programming";  // 값이 같으면 str1 과 str2는 같은곳에 저장해서 불러다 쓰는 방식이다.  <== 같은 메모리 주소에 저장
        String str2 = "Java Programming";  //
        String str3 = new String("Java Programming"); // 같은 메모리를 쓰고 있는 str1 과 str2와 달리 new 로 할당하면 새로운 메모리에 올려서 다른 주소에 저장됨

        System.out.println("원 문자열1 ==> [" + str1 + "]");
        System.out.println("원 문자열2 ==> [" + str2 + "]");
        System.out.println("원 문자열3 ==> [" + str3 + "]\n");

        System.out.println("문자열1==문자열2 결과 :\t " + (str1 == str2)); // String 에서는 값 비교 할때는 == 를 못쓴다.
        System.out.println("문자열1.equals(문자열)2 결과 : " + str1.equals(str2)); // String 에서 값을 비교 할때는 equals 쓰면됨
        System.out.println("문자열1==문자열3 결과 :\t " + (str1 == str3));
        System.out.println("문자열1.equals(문자열3) 결과: " + str1.equals(str3));

        System.out.println("문자열1과 문자열2가 다른지 비교 compareTo 안쓰고, 이렇게 함 : " + !str1.equals(str2));

    }
}

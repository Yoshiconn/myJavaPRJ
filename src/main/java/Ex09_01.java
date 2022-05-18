public class Ex09_01 {
    public static void main(String[] args) {

        String str = "IT CookBook. Java";
        int len;
        len = str.length(); // length 함수는 공백포함 길이를 반환함

        if(str.length() > 0) { // length 함수는 보통 값이 존재하냐 안하냐를 알기위해 많이씀
            System.out.println("str 변수에 값이 존재한다.");
        } else {
            System.out.println("str 변수는 비어있다.");

        }

        System.out.printf("문자열 : %s \n", str);
        System.out.printf("문자열 길이 : %d \n", len);

    }
}

public class Ex08_06 {
    public static void main(String[] args) {
        int aa[] = {10, 20, 30, 40, 50};
        int count, size;

        count = aa.length; // length 함수는 배열의 개수를 알려줌
        size = count * Integer.BYTES; // int 타입은 4바이트 크기를 가짐

        System.out.printf("배열 aa[]의 요소의 개수는 %d 개 입니다.\n",count);
        System.out.printf("배열 aa[]의 요소의 전체 크기는 %d 바이트입니다. \n", size);

        for(int i = 0; i < aa.length; i++){
            System.out.println("aa[" + i + "] : " + aa[i]);
        }
    }
}

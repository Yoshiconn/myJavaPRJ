public class test_0427 {
    public static void main(String[] args){
        int hap = 0;

        for(int i = 50; i < 101; i++) {
            if (( i % 3 != 0) || (i % 7 != 0) || (i % 11 != 0)) {
                hap += i;
            }
        }
        System.out.print(hap);
    }
}
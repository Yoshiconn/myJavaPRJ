public class test04_13 {
    //    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int input = 0;
//        input = sc.nextInt();
//
//        if(input%2==0){
//            System.out.print("짝수");
//        } else {
//            System.out.print("홀수");
//        }
//    }
//}
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int a;
//        a = sc.nextInt();
//
//        if(a%15==0){
//            System.out.print("3과 5의 배수 맞음");
//        } else if (a%3==0) {
//            System.out.print("3의 배수");
//        } else if (a%5==0) {
//            System.out.print("5의 배수");
//        }
//    }
//}
    public static void main(String[] args) {
        int hap = 0;

        for(int i = 0; i < 101; i++) {
            if(i%3==0 || i%5==0) {
                hap += i;
            }
        }
        System.out.print(hap);
    }
}
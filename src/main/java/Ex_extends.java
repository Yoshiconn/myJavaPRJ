abstract class test1 {
    int speed = 0;
    String color;

    void upSpeed(int speed) {
        this.speed += speed;
    }
}

class ex_test1 extends test1 {
}

class ex_test2 extends test1 {

}

public class Ex_extends {
    public static void main(String[] args) {

        ex_test1 ex_test_1 = new ex_test1();
        System.out.println("test1 인스턴스 생성");
        ex_test2 ex_test_2 = new ex_test2();
        System.out.println("test2 인스턴스 생성");

    }
}


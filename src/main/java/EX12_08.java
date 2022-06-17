abstract class Car11 {
    int speed = 0;
    String color;

    void upSpeed(int speed) {
        this.speed += speed;
    }
}

class Sedan3 extends Car11{
}

class Truck3 extends Car11{

}

public class EX12_08 {
    public static void main(String[] args) {

        Sedan3 sedan11 = new Sedan3();
        System.out.println("승용차 인스턴스 생성");
        Truck3 truck11 = new Truck3();
        System.out.println("트럭 인스턴스 생성");

    }
}

class Car2 {
    int speed = 0;

    void upSpeed(int speed) {
        this.speed += speed;
        System.out.println("현재속도(슈퍼클래스) : " + this.speed);
    }
}

class Sedan2 extends Car2 {
    void upSpeed(int speed) {

        this.speed += speed;
        if (this.speed > 150) {
            this.speed = 150;
            System.out.println("현재속도(서브클래스) : " + this.speed);
        }
    }
}

class Truck2 extends Car2 {
}

public class EX12_06 {
    public static void main(String[] args) {

        Truck2 truck2 = new Truck2();
        Sedan2 sedan2 = new Sedan2();

        System.out.print("트럭 -> ");
        truck2.upSpeed(200);

        System.out.print("승용차 -> ");
        sedan2.upSpeed(200);
    }
}

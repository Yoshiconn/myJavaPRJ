class Car1 {
    String color;
    int speed;

    void upSpeed(int value) {
        speed = speed + value;
    }

    void downSpeed(int value) {
        speed = speed - value;
    }
}

class Sedan extends Car1 {
    int seatNum;

    int getSeatNum() {
        return seatNum;
    }
}

class Truck extends Car1 { // Truck 클래스가 extends(상속) Car1 클래스를 상속 받았다. Truck 자식 Car1 부모
    int capacity;

    int getCapacity() {
        return capacity;
    }
}

public class EX12_01 {
    public static void main(String[] args) {

        Sedan sedan1 = new Sedan();
        Truck truck1 = new Truck();

        sedan1.upSpeed(300);
        truck1.upSpeed(100);

        sedan1.seatNum = 5;
        truck1.capacity = 50;

        System.out.println("승용차 속도는" + sedan1.speed + "km, 좌석수는" + sedan1.getSeatNum() + "개 입니다.");
        System.out.println("트록 속도는" + truck1.speed + "km, 적재량은" + truck1.getCapacity() + "톤 입니다.");
    }
}

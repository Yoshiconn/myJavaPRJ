public class Coffeemachine {
    public  void coffee_machine(int button) { // public == 모든 자바 클래스  에서 접근 가능
        System.out.println("1.(자동으로) 뜨거운 물을 준비한다.");
        System.out.println("# 2.(자동으로) 종이컵을 준비한다");

        switch (button) {
            case 1:
                System.out.println("# 3.(자동으로) 보통커피를 탄다.\n");
                break;
            case 2:
                System.out.println("# 3.(자동으로) 설탕커피를 탄다.\n");
                break;
            case 3:
                System.out.println("# 3.(자동으로) 블랙커피를 탄다.\n");
                break;
            default:
                System.out.println("# 3.(자동으로) 아무거나 탄다.\n");
                break;
        }

        System.out.println("# 4.(자동으로) 물을 붓는다.\n");
        System.out.println("# 5.(자동으로) 스폰으로 저어서 녹인다.\n\n");


    }
}

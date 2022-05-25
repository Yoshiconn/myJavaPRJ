import java.util.Scanner;

public class Ex09_11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int coffee;


        System.out.println("어떤 커피를 드릴까요? (1:보통, 2:설탕, 3:블랙) ");
        coffee = sc.nextInt();
        sc.close();

        Coffeemachine cm = new Coffeemachine();
        cm.coffee_machine(coffee);

        System.out.println("손님~ 커피 여기 있습니다.\n");
    }
}


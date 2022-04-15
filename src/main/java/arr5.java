public class arr5 {
    public static void main(String[] args) {

        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
            System.out.println(arr[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            int n = (int) (Math.random() * 10);
            int tmp = arr[0];
            arr[0] = arr[n];
            arr[n] = tmp;
        }
        System.out.println("셔플된 값은?");
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}

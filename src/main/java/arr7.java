public class arr7 {
    public static void main(String[] args) {

        int[] arr = {1,1,3,4,5,5,4,3,4,10,11};
        int[] result = new int [12];

        for (int i = 0; i<arr.length; i++) {

            result[arr[i]]++;
        }
        for(int i = 0; i < result.length; i++) {
            System.out.println(i+"의 개수는 ? : " + result[i]);
        }
    }
}

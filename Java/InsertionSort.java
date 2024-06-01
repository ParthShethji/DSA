import java.util.Arrays;
// errors  
public class InsertionSort { //Stable sorted
    public static void main(String[] args) {
        int[] num = {15, 32, 54, 98, 2, 31, 68, 22, -69};
        Insertion(num);
        System.out.println(Arrays.toString(num));
    }

    static void Insertion(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j >0; j--){
                if (arr[j]< arr[j-1]) {
                    swap(arr, j, j-1);
                }
            }
        }
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

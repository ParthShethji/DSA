import java.util.Arrays;

//some error
public class SelectionSort {
    public static void main(String[] args) {
        int[] num = {15, 32, 54, 98, 2, 31, 68, 22, -69};
        Selection(num);
        System.out.println(Arrays.toString(num));
    }

    static void Selection(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int end = arr.length -i-1;
            int maxindex = getmaxindex(arr, 0, end);
            swap(arr, maxindex, end);
        }
    }

    private static int getmaxindex(int[] arr,int start, int last ){
        int max = start;
        for (int i = 0; i < last; i++) {
            if (arr[i]>arr[max]) {
                max = i;
            }
        }
        return max;
    
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}

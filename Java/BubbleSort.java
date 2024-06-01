import java.util.Arrays;

public class BubbleSort {  //stable adn inplace
    public static void main(String[] args) {
        int[] num = {15, 32, 54, 98, 2, 31, 68, 22, -69};
        bubble(num);
        System.out.println(Arrays.toString(num));
        
    }

    static void bubble(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            boolean swap = false;
            for (int j = 1; j < (arr.length-i); j++) {
                if (arr[j-1]>arr[j]) {
                    int temp = arr[j];
                    arr[j]= arr[j-1];
                    arr[j-1] = temp;
                    swap = true;
                }
            }
            // if not swapped this means array is sorted
            if (!swap) {
                break;
            }
        }
    }
}

// after every iteration largest element reaches end of array
// (n-1)(n-2)/2 - no. of comparisons    

// -------------------------------------------------------------------------------------------------------
// INplsce - if it does not use extra space
//  outplace - it uses eztra space

// stable -relative order that is the order of duplicates is maintained
// unstable - 
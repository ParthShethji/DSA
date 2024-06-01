import java.util.Arrays;

public class QuickSort {
    // Quick sort is smarter
    // divide intelligently using pivot
    // pivoted element is at its same place after 1st iteration
    // widely used for real time application there is no need to combine as it
    // divides in intelligent way

    // i for smaller values
    // j for larger values
    // if j gets assigned to smaller values we first iiterate i then we swap the j
    // and i

    // best/average case - T = O(nlogn) - when pivot element is excatly at center
    // worst case - T=O(n^2), when elements on one side is one only and other side
    // has almost all the elements

    // when array is entirely sorted or almost sorted then we dont use this bcoz we
    // get worst case scenario then use insetion sort comes


    // its an inplace sort algo
    // not a stable sort - order of repetitive elements not preserved

    public static void main(String[] args) {
        int[] num = { 115, 32, 111, 98 };
        // quickSort(num, 0, 4 - 1);
        quickSort1(num, 0, 3);
        System.out.println(Arrays.toString(num));
    }

    static void quickSort(int[] arr, int low, int high) {
        if (low > high) {
            return;
        }
        int start = low;
        int end = high;
        int mid = start + (end - start) / 2;
        int pivot = arr[mid];

        while (start <= end) {
            while (arr[start] < pivot) {
                start++;
            }
            while (arr[end] > pivot) {
                end--;
            }

            if (start <= end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }

        quickSort(arr, low, end);
        quickSort(arr, start, high);
    }

    // ------------------------------------------------------------------

    // function to do the partition of an array
    public static int partition(int[] arr, int l, int h) {
        int pivot = arr[l];
        int i = l;
        for (int j = l + 1; j <= h; j++) {
            if (arr[j] <= pivot) {
                i = i + 1;
                // swap(arr[i], arr[j])
                int tem = arr[i];
                arr[i] = arr[j];
                arr[j] = tem;
            }
        }
        // swap (arr[l], arr[i])
        // to get the correct position of the pivot element
        int tem = arr[l];
        arr[l] = arr[i];
        arr[i] = tem;

        return i;
    }

    // function of the quicksort algorithm
    public static void quickSort1(int[] arr, int l, int h) {
        if (l < h) {
            // 1. Divide the array into two subproblems
            int m = partition(arr, l, h);
            // 2. Conquer the subproblems via the recursion
            quickSort1(arr, l, m - 1);
            quickSort1(arr, m + 1, h);

        }
    }
    //randomised quick sort here the pivot element keeps on changing so 
    // to do this we will just swap the random pivot element with first element and then keep the code same


    // we do this because is when pivoted element is fix getting worst case scenario is more
//    int random = l  + (int)Math.random()%(h-l+1);

}
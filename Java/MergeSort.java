import java.util.Arrays;

public class MergeSort {
    // called merge sort because the main sorting happens when we are combining the elements when when the smaller part returns the value

    //  IN wotst case the stack memory usage is logn 
    // time complexity - o(nlogn)
    public static void main(String[] args) {
        int[] num = { 115, 32, 111, 98};
        int[] ans = mergeSort(num);
        System.out.println(Arrays.toString(ans));
        // InplaceMergeSort(num, 0, 4);
        // System.out.println(Arrays.toString(num));
    }

    static int[] mergeSort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }

        int mid = arr.length / 2;

        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);

    }

    static int[] merge(int[] first, int[] second) {

        int[] mix = new int[first.length + second.length];  
        // this is the extra space 

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                mix[k] = first[i];
                i++;
            } else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }

        while (i < first.length) {
            mix[k] = first[i];
            i++;
            k++;
        }

        while (j < second.length) {
            mix[k] = second[j];
            j++;
            k++;
        }

        return mix;
    }




    static void InplaceMergeSort(int[] arr, int start, int end){
        if(end-start==1){
            return;
        }

        int mid = (start + end)/2;

        InplaceMergeSort(arr, start, mid);
        InplaceMergeSort(arr, mid, end);

        InplaceMerge(arr, start, mid, end);
    }
    

    static void InplaceMerge(int[] arr, int s, int m, int e){
        int[] mix = new int[e-s];           //not understood
        int i = s;
        int j = m;
        int k = 0;

        while (i<j && j<e) {
            if(arr[i]<arr[j]){
                mix[k]=arr[i];
                i++;
            }
            else{
                mix[k]=arr[j];
                j++;
            }
            k++;
        }

        while(i<j){
            mix[k]=arr[i];
            i++;
            k++;
        }

        while(j<e){
            mix[k]= arr[j];
            j++;
            k++;
        }

        for (int l = 0; l < mix.length; l++) {
            arr[s+l] = mix[l];
        }
    }
}

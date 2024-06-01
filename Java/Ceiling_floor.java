/**
 * Celiling
 */
public class Ceiling_floor {

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 8, 10, 12, 18, 24, 27, 35, 39};
        int target = 22;
        // int ans = great(arr, target);
        int ans = floor(arr, target);
        System.out.println(ans);
        
    }

    // static int great(int[] arr, int target){
    //     int start = 0;
    //     int end = arr.length;

    //     while(start<=end){
    //         int mid = start + (end-start)/2;
    //         if (target<arr[mid]) {
    //             end = mid-1;
    //             if (arr[end]<target) {
    //                 return arr[end+1];
    //             }
    //         }

    //         else if(target>arr[mid]){
    //             start = mid+1;
    //             if (target<arr[start]) {
    //                 return arr[start];
    //             }
    //         }
    //         else{
    //             return arr[mid];
    //         }
    //     }
    //     return -1;
    // }


    static int shortcutCeil(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
            while (start <= end) {
            // find the middle element
            // int mid= (start + end) / 2; might be possible that (start + end) exceeds the int range so foll is better way to find mid element
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid-1;
            } else if (target> arr[mid]) {
                start = mid+ 1;
            } else {
            // ans found
            return arr[mid];
            }
        }
        return arr[start];
    }    


    static int floor(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
            while (start <= end) {
            // find the middle element
            // int mid= (start + end) / 2; might be possible that (start + end) exceeds the int range so foll is better way to find mid element
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid-1;
            } else if (target> arr[mid]) {
                start = mid+ 1;
            } else {
            // ans found
            return arr[mid];
            }
        }
        return arr[end];
    }   
}
public class Binary_Search {
    public static void main(String[] args) {
        int[] num = { 12, 32, 54, 98 };
        int target = 54;
        // int answer = binarySearch(num, target);
        int answer = recursiveBinarySearch(num, 0, num.length - 1, target);
        System.out.println(answer);
    }

    // return the index
    // return -1 if it does not exist
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            // find the middle element
            // int mid= (start + end) / 2; might be possible that (start + end) exceeds the
            // int range so foll is better way to find mid element
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }
        }
        return -1;
    }

    public static int recursiveBinarySearch(int[] arr, int low, int high, int target) {
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                return recursiveBinarySearch(arr, mid + 1, high, target);
            } else {
                return recursiveBinarySearch(arr, low, mid - 1, target);
            }
        }
        return -1;
    }
}

// Disadvantage- data must be sorted

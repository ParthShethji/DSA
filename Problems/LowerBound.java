public class LowerBound{
    static int search(int[] arr, int target) {
        int start = 0;
		int result =-1;
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
            result = mid;
			end = mid-1;
            }
        }
        return result;
    } 

	public static void main(String[] args) {
		int[] num = {12, 54, 54, 98};
        int target = 54;
        int answer = search(num, target);
        System.out.println(answer);
    }
}

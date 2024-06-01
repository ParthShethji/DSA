
public class FibbonacciSearch {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 9, 12, 28, 34 };
        int target = 28;
        int answer = fibbonacciSearch(arr, target);
        System.out.println(answer);
    }

    static int min(int a, int b) {
        if (a <= b) {
            return a;
        } else {
            return b;
        }
    }

    static int fibbonacciSearch(int[] arr, int target) {
        int e1 = 0;
        int e2 = 1;
        int en = e1 + e2;

        while (en <= arr.length) {
            e1 = e2;
            e2 = en;
            en = e1 + e2;
        }

        int offset = -1;

        while (en > 1) {
            int i = min(offset + e1, arr.length - 1);
             if (target < arr[i]) {
                en = e2;
                e2 = e1;
                e1 = en - e2;
            } else if (target > arr[i]) {
                offset = i;
                en = e1;
                e2 = e2 - e1;
                e1 = en - e2;
            }
            else{
               return i;
            }

        }

        if (e2 == 1 && arr[arr.length - 1] == target) {
            return arr.length - 1;
        }
        return -1;

    }
}

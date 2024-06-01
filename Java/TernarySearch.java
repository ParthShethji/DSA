public class TernarySearch {
    public static void main(String[] args) {
        int[] num = { 12, 32, 54, 98};
        int target = 98;
        int answer = ternarySearch(num, target);
        System.out.println(answer);
    }

    static int ternarySearch(int[] num, int target) {
        int start = 0;
        int end = num.length - 1;
        while (end >= start) {
            int mid1 = start + (end - start ) / 3;
            int mid2 = end - (end - start) / 3;
            if (num[mid1] > target) {
                end = mid1 - 1;
            } else if (num[mid2] > target && num[mid1] < target) {
                start = mid1 + 1;
                end = mid2 - 1;
            } else if (num[mid2] < target) {
                start = mid2 + 1;
            } else if (num[mid1] == target) {
                return mid1;
            } else if (num[mid2] == target) {
                return mid2;
            }
        }
        return -1;
    }
}

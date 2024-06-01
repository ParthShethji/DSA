
public class LS_min {
    public static void main(String[] args) {
        int[] num = {15, 32, 54, 98, 2, 31, 68, 22, -69};
        int ans = min(num);
        System.out.println(ans);
    }

    static int min(int[] arr){
        int ans = arr[0];
        
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}

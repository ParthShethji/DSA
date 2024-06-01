import java.util.HashMap;
import java.util.Map;

public class DP {
    // nothing but enhanced recursion
    // every dp question solved by 2 methods - memoization || tabulation
    // how to know if it can be solved by dp or not -
    // if we are given a choice (can be solved by recursion but we get TLE error)
    // to remove optimal solution (either mazima or minima)
    // the problem with recursion is that there is again calling of the same thing
    // we have computed in some part of recursive treee and thus we might get TLE

    // memoization-same as recursion but we try to store the result of all recursuve
    // function call


    public static Map<Integer, Long> memo = new HashMap<>();

    public static long fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        if (memo.containsKey(n))
            return memo.get(n);
        long res = fibonacci(n - 1) + fibonacci(n - 2);
        memo.put(n, res);
        return res;
    }


    // tabulation - no recursion a separate data structure is used to store data logically
    public static long fibtab(int n){
        long[] arr=new long[n+1];
        arr[0]=0;
        arr[1]=1;
        for (int i = 2; i <=n; i++) {
            arr[i]=arr[i-1] + arr[i-2];
        }
        return arr[n];

    }

    // more optimized we can make S=O(1) using pointers
    public static long fibptr(int n){
        long first=0, second =1, third;
        for (int i=2; i<=n; i++){
            third=first+second;
            first=second;
            second=third;
        }
        return second;
    }



    public static void main(String[] args) {
        int n = 50;
        // System.out.println(fibonacci(n));
        // System.out.println(fibtab(n));
        System.out.println(fibptr(n));
    }
}

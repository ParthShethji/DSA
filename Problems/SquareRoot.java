import java.util.Scanner;

public class SquareRoot {

    static int squareRoot(int number) {
        int low = 0, high = number, result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            long val = mid * mid;

            if(val==number){
                return mid;
            }
            else if (val<=number){
                result = mid;
                low = mid+1;
            }
            else {
                high = mid - 1;
            }
            
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(squareRoot(number));
    }
}

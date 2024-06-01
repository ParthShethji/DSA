
public class Linear_Search {




    public static void main(String[] args) {
        int[] num = {12, 32, 54, 98, 65, 31, 68, 32, 69};
        int target = 12;
        int answer = search(num, target);
        System.out.println(answer);
         
    }
     
    


    static int search(int[] arr, int target){
        if (arr.length==0) {
                return -1;
        }
    
        for (int i = 0; i < arr.length; i++) {
            if ( arr[i] == target) {
                return i;
            }   
        }

        return -1;   //no value found

    }
}


// Advantage
    // 1. useful in every king of array (sorted and unsorted)
    // 2. simple to understand

// Disadvantage
    // if array size to big causes problem
/**
 * Array
 */
public class Array {

    public static void main(String[] args) {
        int intarr[]; //declare array
        intarr = new int[8];    // Initialize an array of 8 int & set aside memory of 8 int 
        display(intarr);

           // Operation : Insertion
        for(int i=0; i<intarr.length; i++){
            intarr[i] = i+1;
        }

        int add = 5;
        intarr[3] = add;
        display(intarr);

    }


    private static void display(int[] intarr){
        for(int i=0; i<intarr.length; i++ ){
            System.out.println("Array at index " + i +" is: "+ intarr[i]);        }
    }
}
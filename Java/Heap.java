// CBT - complete binary tree has 2 properties
            // insertion of nodes is from left to right
            // the nodes of previous level are filled before next layer starts
    // There are 2 types in cbt  -  almost cbt - the last layer has still space left for nodes to add
                                                // full cbt - each node has either 2 or 0 child nodes

// all heap data structure falls under heap data structure

// properties of fcbt -     no. of leaf nodes = upperBound(n/2)
                                // no. of non - leaf nodes = lowerBound(n/2)
                                // total no. of nodes = (2^k)-1
        
// Heap - min heap and max heap best data structure to store this is arrays bcoz its fcbt there is no wastage of space in an array

        // MIN HEAP - data in parent node < data in child node
        // MAX HEAP - data in parent node > data in child node
// but first check if its a cbt or not


// insetion in min heap - simply add to end of array and then compare with its parent node if less then swap. 
// T = O(log n)


// delete - auto root node will be returned and the last element of the tree will replace root node and then comparison will take place
// T = O(log n)
// to access the min element // T = O(1) but to delete its // T = O(log n)



public class Heap{


        // build max heap - T = O(n)

        public static void heapify(int arr[], int n, int i){   //regains the property of heap when disturbed
                int largest = i;
                int left = 2 * i + 1;
                int right = 2 * i + 2;

                if(left<n && arr[left]>arr[largest])   largest = left;
                if(right<n && arr[right]>arr[largest])  largest=right;
                if(largest!=i){
                        int temp = arr[largest];
                        arr[largest] = arr[i];
                        arr[i]= temp;
                        heapify(arr, n, largest);
                }
        }


        public static void buildHeap(int arr[], int n){
                int start = n/2-2;      //first non-leaf node
                for(int i=start; i>=0;i--){
                        heapify(arr, n, i);
                }

        }


// heapSort - we take root(in maxheap largest element put it atlast and call heapify process excluding that last element)
// T = O(nlog n)
        public static void heapSort(int arr[], int n){
                for (int i = n-1; i >= 0; i--) {
                        int temp = arr[0];
                        arr[0] = arr[i];
                        arr[i]= temp;
                        heapify(arr, i, 0);
                }
        }


// ----------------------------------------------------------------------

        // display function
        public static void display(int arr[], int n){
                for (int i = 0; i < arr.length; i++) {
                        System.out.print(arr[i]+ " ");
                }
                System.out.println(" ");
        }

        public static void main(String[] args) {
                int arr[]= {1,3,5,7,9,11,2,15,17,10,13};
                int n= arr.length;
                buildHeap(arr, n);
                heapSort(arr, n);
                display(arr, n);

        }
}
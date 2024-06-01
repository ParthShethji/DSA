public class Test{
        public static  boolean isPowerOfFour(int n) {
            int ans = n/4;
            while(ans!=4){
                if(ans==0) {
                     return true;
                }
                ans = ans - (ans*4);
            }
            
            return false;
        }
    
        public static void main(String[] args) {
        //    boolean n = isPowerOfFour(32);
        //    System.out.println(n);
        int ans = 15 & 16;
        ans = ans & 17;
        
           System.out.println(ans);
        }
    
}
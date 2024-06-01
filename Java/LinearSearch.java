public class LinearSearch {
    public static void main(String[] args) {
        String Name = "Parth";
        char target = 'r';
        System.out.println(find(Name, target));
    }


    static boolean find(String str, char x){
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)==x){
                return true;
            }
        }
        return false;
    }
}

public class recursiva1{
    public static int funcsoma(int n){
        if(n == 0){
            return 0;
        }

        
            return n + funcsoma(n-1);
        
    }
    public static void main(String[] args) {
        System.out.println(funcsoma(100));
    }
}
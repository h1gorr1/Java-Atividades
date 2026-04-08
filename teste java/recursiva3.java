public class recursiva3 {
    public static double funcdivide(double n){
        if(n == 0){
            return 0;
        }

        return 1/n + funcdivide(n-1);
    }
    public static void main(String[] args){
        System.out.println(funcdivide(5));
    }
    
}


public class OddEven{
    public void main (String[] args){
        int n=68;
        System.out.println(isOdd(n));
    }
    public static boolean isOdd(int n){
        return (n & 1) == 1;
    }
}
import java.lang.Math;
import java.lang.StringBuffer;

public class prime_palindrome{

    public static void main(String args[]){
    
        int max = 0;
        int num = 1000;

        for(int i=1; i<=num; i++){
            if(isPrime(i) && isPalindrome(i))
                max = i;
        }
            
        System.out.println(max);
        System.exit(0);
    }

    public static boolean isPrime(int i){

        int sqrt = (int)Math.sqrt(i);

        for(int j=2; j<=sqrt; j++){
            if(i%j == 0)
                return false;

        }
        return true;

    }

    public static boolean isPalindrome(int i){

        return ((""+i).equals(new StringBuffer(""+i).reverse().toString()));

    }

}

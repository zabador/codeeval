import java.lang.Math;
import java.lang.StringBuffer;

public class sum_prime{

    public static void main(String args[]){
    
        int sum = 0;
        int cap = 1000;
        int i = 2;
        int j =1;


        while(j <= cap){
            if(isPrime(i)){
                sum += i;
                j++;
            }
            i++;
        }
            
        System.out.println(sum);
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
}

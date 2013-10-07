public class interview{

    public static void main(String[] args){

        String s = "Hello World";

        for(int i=s.length()-1; i>=0; i--){
            for (int j=0; j<=s.length()-1; j++){
                if(i==j)
                    System.out.print(s.charAt(j));
            }
        }

    }
}


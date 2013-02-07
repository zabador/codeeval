import java.io.BufferedReader;
import java.io.IOException;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class multiples{

    private static ArrayList<String> input = new ArrayList<String>(); 

    public static void main(String[] args){

        int[] num = new int[2];
        
        openFile(args[0]);

        for(int i=0; i<input.size(); i++){

            int index = 0;
            for(String nums : input.get(i).split(",")){

                num[index] = Integer.parseInt(nums);
                index++;
            }
           
            for(int j=1; j<=num[0];j++){

                int multiple = num[1]*j;
                if(multiple >= num[0]){
                    System.out.println(multiple);
                    break;
                }
            }
        }
        System.exit(0);

    }

    
    public static void openFile(String path){

        try{
            File file = new File(path);
            BufferedReader in = new BufferedReader(new FileReader(file));

            String s;
            while((s = in.readLine()) != null){
                if(s.trim().length()>0)
                    input.add(s);
            }
            in.close();
        }catch(IOException ioe){
            System.out.println("File Read Error: " + ioe.getMessage());
        }
        
    }
}

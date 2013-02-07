import java.io.BufferedReader;
import java.io.IOException;
import java.io.File;
import java.io.FileReader;
import java.util.Arrays;

public class fizzbuzz{

    public static void main(String[] args){

        int A;
        int B;
        int max;
        String s = "";
        int[] nums = new int[3];

        try{
            File file = new File(args[0]);
            BufferedReader in = new BufferedReader(new FileReader(file));
            String line = in.readLine();

            while(line != null){
                int index = 0;
                for (String num : line.split(" ")){
                    nums[index] = Integer.parseInt(num);
                    index++;
                }

                s = "";

                for(int i=1; i<=nums[2]; i++){
                    if(i%nums[0] == 0){
                        if(i==1)
                            s += "F";
                        else
                            s += " F";
                        if(i%nums[1] == 0)
                                s += "B";
                   
                    }else if(i%nums[1] == 0)
                            if(i==1)
                                s += "B";
                            else
                                s += " B";
                    else
                        if(i==1)
                            s += i;
                        else
                            s += " "+i;
                }
                System.out.println(s);
                
                line = in.readLine();
            }

            in.close();
        }catch (IOException ioe){
            System.out.println("File Read Error: " + ioe.getMessage());
        }
        System.exit(0);

    }
}

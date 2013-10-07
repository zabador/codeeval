import java.io.BufferedReader;
import java.io.IOException;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class reverse_words{

    public static void main(String[] args){

        ArrayList<String> s = new ArrayList<String>();

        try{
            File file = new File(args[0]);
            BufferedReader in = new BufferedReader(new FileReader(file));
            String line = in.readLine();

            while(line != null){
            
                for(String str : line.split(" "))
                    s.add(str);

                for(int i=s.size()-1; i>=0; --i)
                    if(i==0)
                        System.out.print(s.get(i));
                    else 
                        System.out.print(s.get(i)+" ");
                System.out.print("\n");
                line = in.readLine();
                s.clear();
            }

            in.close();
        }catch (IOException ioe){
            System.out.println("File Read Error: " + ioe.getMessage());
        }
        System.exit(0);
    }
}


import java.io.BufferedReader;
import java.io.IOException;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class shell{

    private File file;
    private BufferedReader in;
    String line;
    ArrayList<String> line = new ArrayList<String>();

    public static void main(String[] args){
        
        openFile(args[0]);

        line = in.readLine();
        while(line != null){

            // do something
            
            line = in.readLine();
        }




        in.close();
        System.exit(0);
    }

    public static void openFile(String file){

        try{

            this.file = new File(file);
            in = new BufferedReader(new FileReader(this.file));
        }catch(IOException ioe){
            System.out.println("File Read Error: " + ioe.getMessage());
        }
    }
}


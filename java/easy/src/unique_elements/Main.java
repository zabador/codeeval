import java.io.BufferedReader;
import java.io.IOException;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class Main {

    private static ArrayList<String> input = new ArrayList<String>(); 

    public static void main(String[] args) {

        
        openFile(args[0]);
		StringBuilder builder = new StringBuilder();

        for(int i=0; i<input.size(); i++) {

			String key = "";
            for(String a : input.get(i).split(",")) {
			
				if(!a.equals(key)) {
					key = a;
					if(builder.length() != 0) {
						builder.append(",");
					}
					builder.append(key);
				}

            }
			System.out.println(builder);
			builder = new StringBuilder();
            // logic goes here
           
        }
        System.exit(0);

    }

    
    public static void openFile(String path) {

        try{
            File file = new File(path);
            BufferedReader in = new BufferedReader(new FileReader(file));

            String s;
            while((s = in.readLine()) != null) {
                if(s.trim().length()>0)
                    input.add(s);
            }
            in.close();
        }catch(IOException ioe) {
            System.out.println("File Read Error: " + ioe.getMessage());
        }
        
    }
}

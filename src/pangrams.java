import java.io.BufferedReader;
import java.io.IOException;
import java.io.File;
import java.io.FileReader;
import java.util.Arrays;

public class pangrams{

    public static void main(String[] args){

        final int ASCII_OFFSET = 97;
        boolean[] flags = new boolean[26];

        try{
            File file = new File(args[0]);
            BufferedReader in = new BufferedReader(new FileReader(file));
            String line = in.readLine();

            while(line != null){
                String missingLetters = "";

                String s = line.toLowerCase().replaceAll("[^a-z]", "").trim();// delete all none letters

                for(int i=0; i<s.length(); i++){
                    int c = s.charAt(i); // convert letter to ASCII
                    
                    flags[c - ASCII_OFFSET] = true; // set flag to true for the correct letter
                }

                //if flag is false then add letter. Since we go in ASCII order the letters will be in alphabetical order
                for(int i=0; i<flags.length;i++){
                   if(!flags[i])
                       missingLetters += (char)(i + ASCII_OFFSET);
                }

                // print NULL if there are no missing letters otherwise print the missing letters
                System.out.println(missingLetters.length() == 0 ? "NULL" : missingLetters);

                Arrays.fill(flags, false);// set the flags back to false
                
                line = in.readLine();
            }

            in.close();
        }catch (IOException ioe){
            System.out.println("File Read Error: " + ioe.getMessage());
        }
        System.exit(0);
    }
}


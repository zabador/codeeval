import java.io.BufferedReader;
import java.io.IOException;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class Main {

	private static ArrayList<String> input = new ArrayList<String>(); 

	public static void main(String[] args) {


		openFile(args[0]);

		for(int i=0; i<input.size(); i++) {
			ArrayList<String> array = new ArrayList<String>();

			for(String a : input.get(i).split(",")) {

				array.add(a);
				// add words here
			}

			char key = array.get(1).charAt(0);
			int position = 0;
			for (int j = 0; j < array.get(0).length(); j++) {

				if (array.get(0).charAt(j) == key) {
					position = j;
				}
			}

			System.out.println(position);
		
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

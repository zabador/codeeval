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

			ArrayList<String> setOne = new ArrayList<String>();
			ArrayList<String> setTwo = new ArrayList<String>();
			int index = 0;
			for(String a : input.get(i).split(";")) {

				int j = 0;
				for(String b : a.split(",")) {
					if (index == 0) {
						setOne.add(b);
					}
					else {
						setTwo.add(b);
					}
					j++;
					
				}
				index++;
			}

			String delim = ""; // used for putting commas between numbers
			// we want to loop the smaller loop to save time
			if (setOne.size() < setTwo.size()) {
				for (int spot = 0; spot<setOne.size(); spot++) {
					for (int j = 0; j<setTwo.size(); j++) {
						if (setOne.get(spot).equals(setTwo.get(j))) {
							builder.append(delim).append(setOne.get(spot));
							delim = ",";
						}
					}
				}
			}else {
				for (int spot = 0; spot < setTwo.size(); spot++) {
					for (int j = 0; j<setOne.size(); j++) {
						if (setTwo.get(spot).equals(setOne.get(j))) {
							builder.append(delim).append(setTwo.get(spot));
							delim = ",";
						}
					}
				}

			}

			System.out.println(builder);
			builder = new StringBuilder();

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

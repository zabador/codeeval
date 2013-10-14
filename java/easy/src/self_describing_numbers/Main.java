import java.io.BufferedReader;
import java.io.IOException;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class Main {

	private static ArrayList<String> input = new ArrayList<String>(); 
	private static ArrayList number = new ArrayList();

	public static void main(String[] args) {


		openFile(args[0]);

		for(int i=0; i<input.size(); i++) {
			String number = input.get(i);
			int flag = 1;

			for (int j=0; j<number.length();j++) {
				int key = Character.getNumericValue(number.charAt(j));
				int sum = 0;
				for (int m = 0; m<number.length(); m++) {
					if(Character.getNumericValue(number.charAt(m)) == j) {
						sum++;
					}
				
				}
				if (sum != key) {
					flag = 0;
				}
			}
			System.out.println(flag);


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

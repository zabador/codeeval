import java.io.BufferedReader;
import java.io.IOException;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.lang.Math;

public class Main {

	private static ArrayList<String> input = new ArrayList<String>(); 

	public static void main(String[] args) {


		openFile(args[0]);

		StringBuilder builder = new StringBuilder();

		for(int i=0; i<input.size(); i++) {
			String delim = "";
			for (int j = 2; j < Integer.parseInt(input.get(i)); j++) {
				if(isPrime(j)) {
					builder.append(delim).append(j);
					delim = ",";
				}
			}
			System.out.println(builder);
			builder = new StringBuilder();

		}
		System.exit(0);

	}

	public static boolean isPrime(int n) {
		int stop = (int) Math.floor(Math.sqrt(n));

		for(int i = 2;i<=stop;i++) {
			if(n%i == 0) {
				return false;
			}
		}

		return true;
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

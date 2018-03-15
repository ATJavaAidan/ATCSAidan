package sort;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
class sort {
	public static void main(String args[]) {
		File file = new File("/Users/Aidanabdulali/Desktop/words.txt");
		ArrayList<String> names = read(file);
		Collections.sort(names, String.CASE_INSENSITIVE_ORDER);
		for (String x:names) {
			x=x.toLowerCase();
		}
		System.out.println(search(names, "zandt"));
	}

	public static int search(ArrayList<String> y, String x) {
		x = x.toLowerCase();
		int leftbound = 0;
		int rightbound = y.size()-1;
		System.out.println(y.size()-1);
		while (leftbound <= rightbound) {
			int z = ((rightbound+leftbound)/2);
			System.out.println(z);

			if (y.get(z).compareTo(x) == 0) {
				System.out.println("The index of your item is "+z+".");
				return z;
			}
			
			if (z==y.size()-1 || z==0) {
				break;
			}
			
			if (y.get(z).compareTo(x) > 0) {
				leftbound = z + 1;
			}

			if (y.get(z).compareTo(x) < 0) {
				rightbound = z - 1;
			}
			
			else {
				break;
			}
			
		}
		System.out.println("Your item is not in the list!!");	
		return -1;
	}
	public static ArrayList<String> read(File file) {
		ArrayList<String> words = new ArrayList<String>();
		try {
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line;
			while ((line = reader.readLine()) != null) {
				words.add(line);
			}
			reader.close();
			return words;
		}

		catch (Exception e) {
			System.err.format("Exception occurred trying to read '%s'.", file);
			e.printStackTrace();
			return null;
		}
	}
}
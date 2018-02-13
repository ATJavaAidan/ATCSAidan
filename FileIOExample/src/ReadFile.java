import java.io.BufferedReader;
import java.io.FileReader;
public class ReadFile {
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("out1.txt");
			BufferedReader br = new BufferedReader(fr);
			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
			fr.close();

			
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
}

import java.io.FileWriter;

public class WriteFile {
	
	public static void main(String[] args) {
		
		try {
		FileWriter fr = new FileWriter("out.txt");
		}
		catch(Exception failure) {
			System.out.println(failure);
		}
		
		
		
	}

}

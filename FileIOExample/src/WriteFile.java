import java.io.FileWriter;

public class WriteFile {
	
	public static void main(String[] args) {
		
		try {
			FileWriter fr = new FileWriter("out1.txt");
			fr.write("Talk to me now i'm older, your friend told you cause I told her...\n");
			fr.write("Bababum\n");
			fr.write("Arnold\n");
			fr.write("\n");
			fr.close();
		}
		catch(Exception failure) {
			System.out.println(failure);
		}
	}

}

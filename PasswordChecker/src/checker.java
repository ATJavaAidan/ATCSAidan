import java.io.*;
import java.util.*;

public class checker {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter your password into the checker: ");
		String pw = s.next();
		while (true){
			boolean C11 = LengthC(pw);
			boolean C22 = ContainsC(pw);
			if(C11==true && C22==true) {
				System.out.println("You have a valid password.");
				break;
			}
			else {
				System.out.println("You have an invalid password!");
				break;
			}
		}
	}
	
	public static boolean LengthC(String pw) {
		if(pw.length()<8 || pw == null) {
			System.out.println("Error: Your passoword is not of the required length 8!");
			return false;
		}
		System.out.println("Your password is of the required length.");
		return true;
	}
	
	public static boolean ContainsC(String pw) {
		char[] a = pw.toCharArray();
		int w=0;
		int x=0;
		int y=0;
		int z=0;
		char[] UC = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
		char[] LC = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
		char[] SC = {'!','@','#','$','%','^','&','*','(',')','_','-','[',']','{','}',':',';','<','>','.','?'};
		char[] NA = {'1','2','3','4','5','6','7','8','9','0'};
		
		for (char p:a) {
			for (char q:UC) {
				if(q==p) {
					x++;
				}
			}
			
		}
		for (char p:a) {
			for (char q:LC) {
				if(q==p) {
					y++;
				}
			}
			
		}
		for (char p:a) {
			for (char q:SC) {
				if(q==p) {
					z++;
				}
			}
			
		}
		
		for (char p:a) {
			for (char q:NA) {
				if(q==p) {
					w++;
				}
			}
			
		}
		
		if(x>0 && y>0 && z>0 && w>0) {
			System.out.println("Your password contains all of the required characters.");
			return true;
		}
		
		else if(x==0){
			System.out.println("Error: Your password does not contain an uppercase!");
			return false;
		}
		
		else if(y==0){
			System.out.println("Error: Your password does not contain a lowercase!");
			return false;
		}
		
		else if(z==0){
			System.out.println("Error: Your password does not contain a special character!");
			return false;
		}
		
		else if(w==0){
			System.out.println("Error: Your password does not contain a number!");
			return false;
		}
		
		else {
			return false;
		}
	}
	
}

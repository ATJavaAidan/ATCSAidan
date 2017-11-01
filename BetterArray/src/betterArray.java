import java.util.Arrays;
public class betterArray {
	int[] ids;

	public betterArray(int[] nums) {
		ids = nums;
	}

	public boolean contains(int val) {
		// This method determines if val is contained in ids
		for (int i = 0; i < ids.length; i++) {
			if (ids[i] == val) {
				System.out.println("A instance of "+val+" was found.");
				return true;
			}
		}
		System.out.println("No instance of "+val+" was found.");
		return false;
	}

	public void push(int id) {
		// This will increase the size of the array by one and add id to it
		int[] temp = new int[ids.length + 1];
		for (int i = 0; i < ids.length; i++) {
			temp[i] = ids[i];
		}
		ids = temp;
		ids[ids.length - 1] = id;
	}

	public void print() {
		for (int i = 0; i < ids.length; i++) {
			System.out.print(ids[i]+" ");
		}
		System.out.println("    ");
	}

	public int pop() {
		int[] temp = new int[ids.length - 1];
		for (int i = 0; i < ids.length-1; i++) {
			temp[i] = ids[i];
		}
		int lastVal=ids[ids.length-1];
		ids = temp;
		return lastVal;
	}
	
	public int pull(int id) {
		int[] temp = new int[ids.length - 1];
		for (int i=0; i<ids.length; i++) {
			if(ids[i]==id) {
				
			}
		}
	}

	public void position(int id) {
		// Returnes position in array of some id
	}

	public void accessID(int pos) {
		// type a position and access an id
	}

	public void getSize() {

	}
}
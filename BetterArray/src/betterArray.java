public class betterArray {
	int[] ids;

	public betterArray(int[] nums) {
		ids = nums;
	}

	public int contains(int val) {
		// This method determines if val is contained in ids
		int counter=0;
		for (int i = 0; i < ids.length; i++) {
			if (ids[i] == val) {
				System.out.println("A instance of "+val+" was found.");
				counter++;
			}
		}
		return counter;
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
	
	public int remove(int id) {
		if (contains(id)!=0) {
			int[] tempArray=new int[ids.length-contains(id)];
			int counter=0;
			for (int i=0; i<ids.length; i++) {
				if (ids[i]==id) {
					
				}
				else {
					tempArray[counter]=ids[i];
					counter++;
				}
			}
			ids=tempArray;
			return id;
		}
		else {
			return 000000000;
		}
	}
	
	public void swap(int index, int id) {
		if (index<=ids.length-1) {
			ids[index]=id;
		}
		else {
			System.out.println("This index is out of bounds!");
		}
	}
	
	public void insert(int index, int id) {
		int[] tempArray=new int[ids.length+1];
		int counter=0;
		int counter2=0;
		while (counter<tempArray.length) {
			if (counter!=index) {
				tempArray[counter]=ids[counter2];
				counter++;
				counter2++;
			}
			else {
				tempArray[counter]=id;
				counter++;
			}
		}
		ids=tempArray;
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
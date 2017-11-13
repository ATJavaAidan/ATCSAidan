public class betterArray { int[] ids;
	// This is the one class variable, the array itself.

	public betterArray(int[] nums) {ids = nums;}
	//Sets the class variable equal to an integer fed to the class object.
	
	public betterArray() {}
	//If the class is called with no argument, then the ids array defaults to length 0.

	public int get(int index) {
		//Simply returns an id at some index, and returns zeros and an error message
		//if the index is not in the acceptable range.
		if (index>=0 && index<=ids.length-1) {
			return ids[index];
		}
		//
		else {
			System.out.println("Your index is out of bounds!");
			return 0000000000000000000000000000000000000;
		}
	}
	
	public void update(int index, int val) {
		//Updates the value at some index, and returns an error if index is not in array.
		if (index>=0 && index<=ids.length-1) {
			ids[index]=val;
		}
		else {
			System.out.println("Your index is out of bounds!");
		}
	}
	
	public int contains(int val) {
		// This method determines if val is contained in ids.
		//Returns the number of instances of the id which were removed.
		int counter=0;
		for (int i = 0; i < ids.length; i++) {
			if (ids[i] == val) {
				System.out.println("An instance of "+val+" was found.");
				counter++;
			}
		}
		return counter;
	}

	public void push(int id) {
		// This will increase the size of the array by one and add id to it.
		int[] temp = new int[ids.length + 1];
		for (int i = 0; i < ids.length; i++) {
			temp[i] = ids[i];
		}
		ids = temp;
		ids[ids.length - 1] = id;
	}

	public void print() {
		//Prints out every item in the ids array.
		for (int i = 0; i < ids.length; i++) {
			System.out.print(ids[i]+" ");
		}
		System.out.println("    ");
	}

	public int pop() {
		//Removes the last item in the array ids and shortens the length of the array.
		//Returns the id which was removed
		int[] temp = new int[ids.length - 1];
		for (int i = 0; i < ids.length-1; i++) {
			temp[i] = ids[i];
		}
		int lastVal=ids[ids.length-1];
		ids = temp;
		return lastVal;
	}
	
	public int remove(int id) {
		//Searches for a specific id in ids and removes every instance of the id.
		//The new array is cut up to remove the spots containing said id.
		//Returns the id removed, and if no id exists in the array, returns a string of 0s
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

	public void swap(int index1, int index2) {
		//Takes two indices and switches the values.
		//If one of the indices is out of bounds, prints an error message.
		if (index1<ids.length && index2<ids.length) {
			int a=ids[index1];
			ids[index1]=ids[index2];
			ids[index2]=a;
		}
		else {
			System.out.println("One of the indicies was out of bounds!");
		}
	}
	
	public void insert(int index, int id) {
		//Inserts an id at a specific index and then increases the size of the array
		//and moves all further spots over.
		if(index<ids.length) {
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
		else {
			System.out.print("Idex out of bounds!");
		}
	}
	

    public void bubbleSort() {
    	//Uses the inefficient bubble sort to organize all ids in the array ids
    	//in least to greatest order.
    	int counter=0;
        for (int i = 0; i < ids.length-1; i++) {
            for (int n = 0; n < ids.length-i-1; n++) {
                if (ids[n] > ids[n+1]) {
                    swap(n, n+1);
                    counter++;
                }
            }
        }
    System.out.println(counter);
    }
    
    public int max() {
    	//Returns the maximum value in the array.
    		int temp=ids[0];
    		for (int i=0; i<=ids.length-1; i++) {
    			if (ids[i]>temp) {
    				temp=ids[i];
    			}
    		}
    		return temp;
    }
    
    public int min() {
    	//Returns the minimum value in the array.
		int temp=ids[0];
		for (int i=0; i<=ids.length-1; i++) {
			if (ids[i]<temp) {
				temp=ids[i];
			}
		}
		return temp;
    }
    
    public int size() {
    	//Returns the size of the array.
    		return ids.length;
    }
    
    public double average() {
    	//Returns the double average of items in the array.
    		double sum=0.0;
    		for (int i=0; i<ids.length; i++) {
    			sum=sum+ids[i];
    		}
    		double denominator= ids.length;
    		return (sum/(denominator));
    }
}
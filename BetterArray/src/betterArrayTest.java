
public class betterArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {10,9,23,235,7,34,594,324,-10,23,4,5,2,4,7,8};
		betterArray packer = new betterArray(nums);
		packer.print();
		packer.bubbleSort();
		packer.print();
		
	}

}

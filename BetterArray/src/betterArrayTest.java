
public class betterArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {1,2,3,4,5,6,7,8,9,10};
		betterArray packer = new betterArray(nums);
		packer.print();
		packer.insert(3,-1);
		packer.print();
		
	}

}

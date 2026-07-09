
public class Ex04 {

	public static void main(String[] args) {
		NumberArrayController nums = new NumberArrayController();
		nums.display("Display an initial array: ");
		
		int[] new_nums = new int[nums.getNums().length-1];
		
		//copy
		for (int i=0; i<new_nums.length; i++) {
			new_nums[i] = nums.getNums()[i+1];
		}
		
		//display
		nums.setNums(new_nums);
		nums.display("After deleted the first element: ");
	}

}

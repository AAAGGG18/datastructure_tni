public class testApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {11, 9, 23, 87, 38, 22, 92, 10};
		int[] nums2 = {25, 11, 45, 6, 87, 20, 78, 64};
		int[] nums3 = {68, 10, 87, 75, 14, 36, 98, 76};
		int[] nums4 = {87, 11, 26, 35, 49, 85, 21, 46};
		
		Sorting sort1 = new Sorting(nums);
		sort1.bubbleSort();
		sort1.PrintSortedData();
		System.out.println("\n------------------------");
		
		Sorting sort2 = new Sorting(nums2);
		sort2.selectionSort();
		sort2.PrintSortedData();
		System.out.println("\n------------------------");
		
		Sorting sort3 = new Sorting(nums3);
		sort3.insertionSort();
		sort3.PrintSortedData();
		System.out.println("\n------------------------");
		
		Sorting sort4 = new Sorting(nums4);
		sort4.quicksort();
		sort4.PrintSortedData();
		
	}

}
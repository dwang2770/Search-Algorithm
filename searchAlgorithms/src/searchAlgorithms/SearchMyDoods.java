package searchAlgorithms;

public class SearchMyDoods {

	public static void main(String[] args) 
	{
		int [] test1 = {1,2,3,4,5,6,7,8,9,10};
		int [] test2 = {0,4,5,6,12,15,17,23,29};
		
		System.out.println(binSearch(test1, 3));
		System.out.println(linSearch(test1, 3));
		
		System.out.println(binSearch(test2,23 ));
		System.out.println(linSearch(test2,23 ));

		System.out.println(binSearch(test2,25 ));
		System.out.println(linSearch(test2,25 ));
		
		System.out.println(binSearch(test1,10 ));
		System.out.println(linSearch(test1,1 ));
		
		System.out.println(binSearch(test1,1 ));
	}
	
	public static int linSearch(int [] nums, int query)
	{
		for (int i = 0; i <nums.length -1; i++)
		{
			if (nums[i] == query)
			{
				return i;
			}
		}
		return -1;
	}
	
	public static int binSearch(int [] nums, int query)
	{
		int L = 0;
		int R = nums.length-1;
		while (L <= R)
		{
			int mid = L + (R-L)/2;
			if (nums[mid] == query)
			{
				return mid;
			}
			if (nums[mid] > query)
			{
				R = mid - 1;
			}
			if(nums[mid] < query)
			{
				L = mid +1;
			}
		}
		return -1;
	}


}

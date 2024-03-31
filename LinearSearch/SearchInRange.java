package LinearSearch;

public class SearchInRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1, 22, 56, 78, 63, 99};
		int key = 78;
			
			System.out.println(LinearSearch(arr, key, 1, 3));
	}
	static int LinearSearch(int arr[], int key, int start, int end) {
		if(arr.length == 0)
			return -1;
		for(int i = start; i <= end; i++) {
			if(arr[i] == key)
				return i;			
		}
		return -1;
	}

}

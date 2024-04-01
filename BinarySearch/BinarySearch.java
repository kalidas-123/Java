//JAVA PROGRAM FOR BINARY SEARCH
package BinarySearch;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {-56, -23, -2, 0, 3, 8, 45, 75};
		int key = 8;
		
		System.out.println(binarySearch(arr, key));
	}
	
	//returns the index
	static int binarySearch(int[] arr, int key) {
		int start = 0;
		int end = arr.length - 1;
				
		while(start <= end) {
			int mid = start + (end - start)/2;
			
			if(key < arr[mid]) {
				end = mid -1;				
			}else if(key > arr[mid]) {
				start = mid + 1;
			}else 
				return mid;
		}
		return -1;
	}

}

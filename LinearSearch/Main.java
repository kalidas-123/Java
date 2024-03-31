//JAVA PROGRAM FOR LINEAR SEARCH IN AN ARRAY
package LinearSearch;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1, 22, 56, 78, 63, 99};
		int key = 78;
		
		System.out.println(LinearSearch(arr, key));
		System.out.println(LinearSearch2(arr, key));
	}
	
	static int LinearSearch(int arr[], int key) {
		if(arr.length == 0)
			return -1;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == key)
				return i;			
		}
		return -1;
	}
	
	//SEARCH THE TARGET AND RETURN TRUE OR FALSE
	static boolean LinearSearch2(int arr[], int key) {
		if(arr.length == 0)
			return false;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == key)
				return true;			
		}
		return false;
	}

}

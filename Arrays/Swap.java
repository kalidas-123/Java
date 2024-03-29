//SWAPPING TWO NUMBERS USING ARRAY INDICES
package Arrays;
import java.util.*;
public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1, 2, 5, 7};
		
		swap(arr, 1, 3);
		System.out.println(Arrays.toString(arr));
	}
	
	static void swap(int[] arr, int index1, int index2) {
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}
}

package Arrays;
import java.util.*;
public class MaxValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 4, 9, 8, 70, 23};
		
		reverse(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(maxRange(arr, 1, 3));
	}

	static int max(int[] arr) {
		int maxVal = arr[0];
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > maxVal)
				maxVal = arr[i];
		}
		return maxVal;
	}
	
	static int maxRange(int[] arr, int start, int end) {
		int maxVal = arr[start];
		for(int i = start; i < end; i++) {
			if(arr[i] > maxVal)
				maxVal = arr[i];
		}
		return maxVal;
	}
	
	static void reverse(int[] arr) {
		int start = 0;
		int end = arr.length-1;
		
		while(start < end) {
			swap(arr, start, end);
			start++;
			end--;
		}
		
}
	static void swap(int[] arr, int index1, int index2) {
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}
}
	



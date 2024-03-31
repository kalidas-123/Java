package LinearSearch;

import java.util.Arrays;

public class Searchin2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] arr = {
				{1, 2, 3},
				{5, 6, 9},
				{63, 52, 45}
		};
		int key = 52;
		int[] result = search(arr, key);
		System.out.println(Arrays.toString(result));
		System.out.println(max(arr));

	}

	 static int[] search(int[][] arr, int key) {
		 for(int i = 0; i < arr.length; i++) {
			 for(int j = 0; j < arr[i].length; j++) {
				 if(key == arr[i][j])
					 return new int[] {i ,j};
			 }
		 }
		 return new int[] {-1, -1};
	 }
	 
	 static int max(int[][] arr) {
		 int max = arr[0][0];
		 for(int[] i : arr ) {
			 for(int j : i ) {
				 if(j > max)
					 max = j;
			 }
		 }
		 return max;
	 }

}

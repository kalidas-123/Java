package Arrays;
import java.util.*;
public class MultiDimension {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
//		int[][] arr = new int[3][];
//		
//		int[][] arr2 = {
//				{1, 2,3},  	//0th index
//				{4, 5},		//1st index
//				{6, 7, 8, 9}//2nd index
//		};
		
		int[][] arr = new int[3][3];
		System.out.println(arr.length);  //prints number of rows
		
		for (int row = 0; row < arr.length; row++) {
			for(int col = 0; col < arr[row].length; col++)
				arr[row][col] = sc.nextInt();
		}
		
		for (int row = 0; row < arr.length; row++) {			
				System.out.println(Arrays.toString(arr[row]));
			
		}
		
		for(int[] a:arr) {
			System.out.println(Arrays.toString(a));
		}
	}

}

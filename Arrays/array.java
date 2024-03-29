package Arrays;
import java.util.*;
public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
//		int[] arr = new int[5];
//		for(int i = 0; i < arr.length; i++) {
//			arr[i] = sc.nextInt();
//		}
		
//		for(int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
//		
		
		//for-each type 
//		for(int j : arr)	//for every element in array print the element
//			System.out.println(j); 	//j represents element of the array
		
//		System.out.println(arr[6]);  Index out of bound error
		
//		System .out.println(Arrays.toString(arr));
		
		String[] str = new String[4];
		for(int i = 0; i < str.length; i++)
			str[i] = sc.next();
		
		System.out.println(Arrays.toString(str));
	}

}

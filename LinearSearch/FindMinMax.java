package LinearSearch;

public class FindMinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 22, -56, 78, 63, 99};
		
		System.out.println(min(arr));

	}
	static int min(int[] arr) {
		int min = arr[0];
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] < min)
				min = arr[i];
		}
		return min;
	}

}

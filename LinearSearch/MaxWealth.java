package LinearSearch;

public class MaxWealth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	static int maxWealth(int[][] arr) {
		int rowsum = 0, max = 0;
		for(int row = 0; row < arr.length; row++) {			
			for(int col = 0; col < arr[row].length; col++)
				rowsum = rowsum + arr[row][col];
				max = rowsum;
		}
		if (rowsum > max)
			max = rowsum;
		
		return max;
	}
	
}

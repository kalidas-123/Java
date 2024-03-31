//FIND THE NUMBERS WITH EVEN NUMBER OF DIGITS IN A GIVEN ARRAY
package LinearSearch;

public class EvenDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1, 22, 56, 78, 663, 99};
		
		System.out.println(findNum(arr));
		
		System.out.println(digits2(684));
		
	}
	static int findNum(int[] arr){
		int count = 0;
		
		for(int num : arr) {
			if(even(num))
				count++;
		}
		
		return count;
	}
	
	//to check whether the given number contains even number of digits
	static boolean even(int num) {
		 int num_digits = digits(num);
		 
		 if (num_digits % 2 == 0)
			 return true;
		return false;
	}
	
	//count the number of digits in a number
	static int digits(int num) {
		int count = 0;
		
		if(num < 0)
			num = num * -1;
		
		if(num == 0) {
			return 1;
		}
		
		while(num > 0) {
			count++;
			num = num/10;
		}
		return count;
	}
	
	static int digits2(int num) {
		return (int)(Math.log10(num)) + 1;
	}

}

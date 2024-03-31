package LinearSearch;

import java.util.Arrays;

public class SearchInString {
	public static void main(String[] args) {
		String str = "Develpoment";
		char key = 'm';
		
		System.out.println(search(str, key));
		System.out.println(Arrays.toString(str.toCharArray()));
		System.out.println(search2(str, key));
		
	}
	
	static boolean search(String str, char key) {
		if(str.length() == 0)
			return false;
		for(int i = 0; i < str.length(); i++) {
			if( key == str.charAt(i))
				return true;
		}			
		return false;
	}
	
	static boolean search2(String str, char key) {
		if(str.length() == 0)
			return false;
		
		for(char ele: str.toCharArray()) {
			if( ele == key)
				return true;
		}			
		return false;
	}
}

package Functions;

import java.util.*;

public class Fun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fun(1,2,3);
	}
	
	//Variable Arguments Program 
	static void fun(int ...v) {
		System.out.println(Arrays.toString(v));
	}

}

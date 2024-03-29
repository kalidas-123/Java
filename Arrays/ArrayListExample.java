package Arrays;
import java.util.*;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(45);
		list.add(36);
		list.add(99);
		list.add(10);
		list.remove(2);

		System.out.println(list);
		System.out.println(list.contains(10));
 	}

}

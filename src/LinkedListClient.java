import java.util.*;

//code that removes all the data values 3 from the end of the list

public class LinkedListClient{
	public static void main(String[] args){
		int[] data = {3, 2, 3, 3, 19, 8, 3, 43, 64, 1, 0, 3, 5, 3, 6, 7, 3, 603};
		LinkedIntList list = new LinkedIntList();
			
		System.out.println("result for empty list "+ list);
	
		for(int n: data){
			list.add(n);
		}

		System.out.println("The list is full: " + list);
		System.out.println();

		int nov = list.numberOfSearchValues(3);

		for (int i = 0;i < nov; i++) {
			list.removeLast(3);
			System.out.println(list);
		}

	}
}

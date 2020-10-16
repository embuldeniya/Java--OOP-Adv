package twentyOne;

import java.util.ArrayList;
import java.util.LinkedList;

public class AListVLList {

	public static void main(String[] args) {
		
		
		ArrayList <Integer> arrayList = new ArrayList<>();
		LinkedList<Integer> linkedList= new LinkedList<>();
		
		
		for (int i = 0; i < 10000 ; i ++) {
			
			linkedList.add(i);
			arrayList.add(i);
		}
		
		final long startTimeLL = System.nanoTime();
		linkedList.get(1);
		final long endTimeLL = System.nanoTime();
		
		final long startTimeAL = System.nanoTime();
		arrayList.get(1);		
		final long endTimeAL = System.nanoTime();
		
		
		long exectionTimeLL =   endTimeLL- startTimeLL;
		long exectionTimeAL =  endTimeAL - startTimeAL;
		
		
		System.out.println("total execution time for Linkedlist " +  exectionTimeLL );
		System.out.println("total execution time for Arraylist " +  exectionTimeAL );
		
		
		

	}

}

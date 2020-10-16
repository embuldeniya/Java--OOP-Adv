package twentyOne;

import java.util.ArrayList;

public class Aldemo {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();

		al.add(0);
		al.add(11);
		al.add(22);
		al.add(33);
		al.add(55);
		al.add(77);
		al.add(44);
		al.add(99);
		al.add(88);

		for (Integer x : al) {
			System.out.println(x);
		}

		al.add(66);
		al.remove(5);
		
		System.out.println("After");
		for (Integer x : al) {
			System.out.println(x);
		}

	}

}

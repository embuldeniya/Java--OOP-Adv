package twentyOne;

import java.util.LinkedList;

public class Lldemo {

	public static void main(String[] args) {

		LinkedList<Integer> linklst = new LinkedList<Integer>();

		linklst.add(0);
		linklst.add(11);
		linklst.add(22);
		linklst.add(33);
		linklst.add(55);
		linklst.add(77);
		linklst.add(44);
		linklst.add(99);
		linklst.add(88);

		for (Integer x : linklst) {

			System.out.println(x);

		}

		System.out.println("After");
		linklst.remove(5);
		linklst.add(66);
		linklst.add(55);

		for (Integer x : linklst) {

			System.out.println(x);

		}
	}

}
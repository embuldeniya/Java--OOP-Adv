package test;





public class test1 {

	public static void main(String[] as) {
		String object = "hello";
		
		int counter =0;
		for (int i =0 ; i<10000 ;i++) {
			
			object +=counter;
		}
			
			System.out.println(object);
	}

}

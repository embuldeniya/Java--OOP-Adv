package twelve;

class Demo{
	
	private int x,y; //instance variable 

	public Demo() {
		System.out.println("Hi this is initial constructor type....");
	}
	public Demo(int x , int y) {
		System.out.println("Hi this is second constructor type....");
		this.x = x;
		this.y = y;
	}
	public void read(int x, int y) {
		this.x = x;
		this.y = y;		
	}
	public void show () {
		System.out.println("The value of x is : " +x );
		System.out.println("The value of y is : " +y);
		
	}
	public void sum() {
		System.out.println("The sum is : " + (x+y));
	}
	
	public void sub() {
		System.out.println("The sub is : " + (x-y));
	}

}
public class DemoEx {

	public static void main(String[] args) {
		Demo demo = new Demo();
		demo.read(100,200);
		demo.show();
		demo.sum();
		demo.sub();
		
		System.out.println("\n");
		Demo demo2 = new Demo();
		demo2.read(10,20);
		demo2.show();
		demo2.sum();
		demo2.sub();
		
		System.out.println("\n");
		Demo demo3 = new Demo(500,300);
		demo3.show();
		demo3.sum();
		demo3.sub();
	}
}

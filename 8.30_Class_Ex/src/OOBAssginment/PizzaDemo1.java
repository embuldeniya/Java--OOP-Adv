package OOBAssginment;

public class PizzaDemo1 {

	public static void main(String[] args) {

		NonVeg ord1 = new NonVeg(50, "nonveg", "nonvegstuffed", "small", "chicken");

		float price = ord1.calculateBillAmount();

		System.out.println(price);

		NonVeg ord2 = new NonVeg(80, "Non-Veg", "NonVegnotstuffed", "Medium", "chicken");

		float price2 = ord2.calculateBillAmount();

		System.out.println(price2);

		System.out.println("////////////////////////");

		Veg ord3 = new Veg(90, "Veg", "vegStuffed", "Large", "Onions");

		float price3 = ord3.calculateBillAmount();

		System.out.println(price3);

		Veg ord4 = new Veg(78, "veg", "vegnotStuffed", "s", "Onions");

		float price4 = ord4.calculateBillAmount();

		System.out.println(price4);
				
		System.out.println("////////////////////////");
		
		Veg ord6 = new Veg (60,"veg", "vegnottuffed", "medium", "mushrooms");
		
		float price6 = ord6.calculateBillAmount();
		
		System.out.println(price6);
		
		
		
		NonVeg ord5 = new NonVeg (20, "noveg", "nonVegstuffd", "Large", "beef");
		
		float price5 = ord5.calculateBillAmount();
		
		System.out.print(price5);
		
		
	}

}

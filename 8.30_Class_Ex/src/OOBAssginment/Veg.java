package OOBAssginment;

public class Veg extends Pizza {

	private String vegToppings;
	private static int counter = 1;

	public Veg() {
	}

	public Veg(int id, String cate, String type, String size, String vegTops) {
		super(id, cate, type, size);
		this.vegToppings = vegTops;
	}

	public String getVegToppings() {
		return this.vegToppings;
	}

	@Override
	public boolean validateType() {

		String type = getType();

		if (type.equals("vegstuffed") || type.equals("vegnotstuffed")) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public float identifyCost() {

		// condition check for Pizza Size
		
	

		if (validateSize() && validateType()) {
			
			String type = getType();
			String size = getSize();
			
			if (type.equals("vegstuffed")) {

				switch (size.charAt(0)) {

				case 's':
					return 30;
				case 'm':
					return 60;
				case 'l':
					return 90;
				}
			} else if (type.equals("vegnotstuffed")) {

				switch (size.charAt(0)) {

				case 's':
					return 20;
				case 'm':
					return 40;
				case 'l':
					return 80;
				}
			}		
			
			
			
		} else {

			System.out.println("Input the correct Pizza Size or Type ");
			return 0;	
		}
		return 0;

	}

	@Override
	public float calculateBillAmount() {

		if (validateCategory()) {

			float costPizza = identifyCost();

			if (costPizza !=0) {
				
				float billAmount = costPizza + (costPizza * 5) / 100;

				String str = getItemId() + String.valueOf(counter++);

				int billId = Integer.parseInt(str);
				
				System.out.print(billId + ": amount for Veg Pizza is" + " : ");

				return billAmount;
				
			}
			
		} else if (!validateCategory()) {

			System.out.print("Input the correct Pizza Category ");
			return 0;
		}

		System.out.print("Unable to compute cost of the Veg pizza ");
		return 0;

	}

}

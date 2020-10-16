package OOBAssginment;

public class NonVeg extends Pizza {

	private String nonVegToppings;
	private static int counter = 1;

	public NonVeg() {
	}

	public NonVeg(int id, String cate, String type, String size, String nonTops) {
		super(id, cate, type, size);
		this.nonVegToppings = nonTops;

	}

	public String getNonVegToppings() {
		return this.nonVegToppings;
	}

	@Override
	public boolean validateType() {

		String type = getType();

		if (type.equals("nonvegstuffed") || type.equals("nonvegnotstuffed")) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public float identifyCost() {

		if (validateSize() && validateType()) {

			String type = getType();
			String size = getSize();

			if (type.equals("nonvegstuffed")) {

				switch (size.charAt(0)) {

				case 's':
					return 50;
				case 'm':
					return 100;
				case 'l':
					return 150;
				}
			} else if (type.equals("nonvegnotstuffed")) {

				switch (size.charAt(0)) {

				case 's':
					return 40;
				case 'm':
					return 80;
				case 'l':
					return 120;
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
			
			if (costPizza != 0) {
				
				float billAmount = costPizza + (costPizza * 10) / 100;

				String str = getItemId() + String.valueOf(counter++);

				int billId = Integer.parseInt(str);

				System.out.print(billId + " : amount for Non-Veg is " + " : ");

				return billAmount;
				
			}
		

		} else if (!validateCategory()) {

			System.out.print("Input the correct Pizza Category ");
			return 0;
		}

		System.out.print("Unable to compute cost of the NonVeg pizza ");
		return 0;

	}

}

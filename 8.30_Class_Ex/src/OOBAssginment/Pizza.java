package OOBAssginment;

abstract public class Pizza {

	private int itemId;
	private int billId;
	private String category;
	private String type;
	private String size;

	Pizza() {
	}

	Pizza(int id, String cat1, String type1, String size1) {

		this.itemId = id;

		this.category = cat1;

		// sanitize inputs for Pizza Type
		String type = type1.toLowerCase();
		this.type = type;

		// sanitize inputs for Pizza Size
		String size = size1.toLowerCase();
		this.size = size;
	}

	public int getItemId() {
		return itemId;
	}

	public int getBillId() {
		return billId;
	}

	public String getType() {
		return type;
	}

	public String getCategory() {
		return category;
	}

	public String getSize() {
		return size;
	}

	public boolean validateCategory() {

		String cate = this.category;

		cate = cate.replace("-", "");
		cate = cate.toLowerCase();

		if (cate.equals("veg") || cate.equals("nonveg")) {

			return true;
		}

		else {
			return false;
		}
	}

	public boolean validateSize() {

		String s = this.size;

		if (s.charAt(0) == 's' || s.charAt(0) == 'm' || s.charAt(0) == 'l') {
			return true;
		} else {
			return false;
		}

	}

	abstract public boolean validateType();

	abstract public float identifyCost();

	abstract public float calculateBillAmount();

}

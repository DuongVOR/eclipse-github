package thu;

abstract class Product {
	private String product_id;
	private String product_name;
	private double product_price;
	private int product_total;

	// Constructor không tham số
	public Product() {
	}

	// Constructor đủ tham số
	public Product(String product_id, String product_name, double product_price, int product_total) {
		this.product_id = product_id;
		this.product_name = product_name;
		this.product_price = product_price;
		this.product_total = product_total;
	}

	// Getter và Setter
	public String getProductId() {
		return product_id;
	}

	public void setProductId(String string) {
		this.product_id = string;
	}

	public String getProductName() {
		return product_name;
	}

	public void setProductName(String product_name) {
		this.product_name = product_name;
	}

	public double getProductPrice() {
		return product_price;
	}

	public void setProductPrice(double product_price) {
		this.product_price = product_price;
	}

	public int getProductTotal() {
		return product_total;
	}

	public void setProductTotal(int product_total) {
		this.product_total = product_total;
	}

	// Phương thức trừu tượng
	public abstract double getTotalPrice();

	// Phương thức toString
	@Override
	public String toString() {
		return "Product ID: " + product_id + ", Product Name: " + product_name + ", Product Price: " + product_price
				+ ", Product Total: " + product_total;
	}
}
package thu;

import java.util.Scanner;

class Mobile extends Product {
	private String mobile_manufacturer;
	private String mobile_ram;

	// Constructor không tham số
	public Mobile() {
	}

	// Constructor đủ tham số
	public Mobile(String product_id, String product_name, double product_price, int product_total,
			String mobile_manufacturer, String mobile_ram) {
		super(product_id, product_name, product_price, product_total);
		this.mobile_manufacturer = mobile_manufacturer;
		this.mobile_ram = mobile_ram;
	}

	// Getter và Setter cho các thuộc tính mới
	public String getMobileManufacturer() {
		return mobile_manufacturer;
	}

	public void setMobileManufacturer(String mobile_manufacturer) {
		this.mobile_manufacturer = mobile_manufacturer;
	}

	public String getMobileRam() {
		return mobile_ram;
	}

	public void setMobileRam(String mobile_ram) {
		this.mobile_ram = mobile_ram;
	}

	// Cài đặt phương thức getTotalPrice
	@Override
	public double getTotalPrice() {
		double baseTotal = getProductTotal() * getProductPrice();
		return baseTotal * 1.2; // Cộng 20% chi phí quản lý
	}

	// phuong thuc nhap thong tin
	public void setInfor() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap id san phan: ");
		setProductId(sc.next());
		System.out.println("Nhap ten san phan: ");
		setProductName(sc.next());
		System.out.println("Nhap gia san phan: ");
		setProductPrice(sc.nextInt());
		System.out.println("Nhap so luong san phan: ");
		setProductTotal(sc.nextInt());
		System.out.println("Nhap ten hang dien thoai: ");
		setMobileManufacturer(sc.next());
		System.out.println("Nhap ram dien thoai: ");
		setMobileRam(sc.next());
		sc.close();
	}

	// Phương thức toString
	@Override
	public String toString() {
		return super.toString() + ", Manufacturer: " + mobile_manufacturer + ", RAM: " + mobile_ram;
	}
}

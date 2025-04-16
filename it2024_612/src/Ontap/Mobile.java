package Ontap;

import java.util.Scanner;

public class Mobile extends Product {
	protected String mobile_manufacturer;
	protected int mobile_ram;

	// phuong thuc tao
	public Mobile() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Mobile(String manufacturer, int ram, String id, String name, int price, int total) {
		super(id, name, price, total);
		this.mobile_manufacturer = manufacturer;
		this.mobile_ram = ram;

		// TODO Auto-generated constructor stub
	}
	// phuong thuc getter and setter

	public String getMobile_manufacturer() {
		return mobile_manufacturer;
	}

	public void setMobile_manufacturer(String mobile_manufacturer) {
		this.mobile_manufacturer = mobile_manufacturer;
	}

	public int getMobile_ram() {
		return mobile_ram;
	}

	public void setMobile_ram(int mobile_ram) {
		this.mobile_ram = mobile_ram;
	}
	// phuong thuc toString

	@Override
	public String toString() {
		return "Mobile [mobile_manufacturer=" + mobile_manufacturer + ", mobile_ram=" + mobile_ram + ", product_id="
				+ product_id + ", product_name=" + product_name + ", product_price=" + product_price
				+ ", product_total=" + product_total + "]";
	}

	// phuong thuc tinh gia
	public double getTotalPrice() {
		return product_total * product_price + (20.0 / 100);
	}

	public void setInfor(Scanner sc) {
		System.out.println("Nhap id san phan: ");
		setProduct_id(sc.next());
		System.out.println("Nhap ten san phan: ");
		setProduct_name(sc.next());
		System.out.println("Nhap gia san phan: ");
		setProduct_price(sc.nextInt());
		System.out.println("Nhap so luong san phan: ");
		setProduct_total(sc.nextInt());
		System.out.println("Nhap ten hang dien thoai: ");
		setMobile_manufacturer(sc.next());
		System.out.println("Nhap ram dien thoai: ");
		setMobile_ram(sc.nextInt());
	}
}

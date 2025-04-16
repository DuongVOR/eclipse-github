package ontap2;

import java.util.Scanner;

public class Car extends Vehicle {
	protected String carBrand;
	protected String carEngine;

	// phuong thuc tao
	public Car() {
	}

	public Car(String vehicleid, String vehiclename, int vehicleprice, int vehiclequa, String brand, String engine) {
		super(vehicleid, vehiclename, vehicleprice, vehiclequa);
		this.carBrand = brand;
		this.carEngine = engine;
	}
	// phuong thuc getter and setter

	public String getCarBrand() {
		return carBrand;
	}

	public void setCarBrand(String carBrand) {
		this.carBrand = carBrand;
	}

	public String getCarEngine() {
		return carEngine;
	}

	public void setCarEngine(String carEngine) {
		this.carEngine = carEngine;
	}
	// phuong thuc toString

	@Override
	public String toString() {
		return "Car [carBrand=" + carBrand + ", carEngine=" + carEngine + ", vehicleid=" + vehicleid + ", vehiclename="
				+ vehiclename + ", vehicleprice=" + vehicleprice + ", vehiclequa=" + vehiclequa + "]";
	}

	// cai dat phong thuc gettTotalValues
	public double getTotalValues() {
		return (double) (vehicleprice * vehiclequa);
	}

	// Nhap thong tin
	public void setInfor(Scanner sc) {
		System.out.println("Nhap vao id cua xe:");
		setVehicleid(sc.next());
		System.out.println("Nhap vao name cua xe:");
		setVehiclename(sc.next());
		System.out.println("Nhap vao gia cua xe:");
		setVehicleprice(sc.nextInt());
		System.out.println("Nhap vao so luong cua xe:");
		setVehiclequa(sc.nextInt());
		System.out.println("Nhap vao brand cua xe:");
		setCarBrand(sc.next());
		System.out.println("Nhap vao engine  capacity cua xe:");
		setCarEngine(sc.next());
	}
}

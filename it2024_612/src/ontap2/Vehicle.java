package ontap2;

public abstract class Vehicle {
	protected String vehicleid;
	protected String vehiclename;
	protected int vehicleprice;
	protected int vehiclequa;

	// phuong thuc tao
	public Vehicle() {
	}

	public Vehicle(String vehicleid, String vehiclename, int vehicleprice, int vehiclequa) {
		this.vehicleid = vehicleid;
		this.vehiclename = vehiclename;
		this.vehicleprice = vehicleprice;
		this.vehiclequa = vehiclequa;
	}

	// phuong thuc getter and setter
	public String getVehicleid() {
		return vehicleid;
	}

	public void setVehicleid(String vehicleid) {
		this.vehicleid = vehicleid;
	}

	public String getVehiclename() {
		return vehiclename;
	}

	public void setVehiclename(String vehiclename) {
		this.vehiclename = vehiclename;
	}

	public int getVehicleprice() {
		return vehicleprice;
	}

	public void setVehicleprice(int vehicleprice) {
		this.vehicleprice = vehicleprice;
	}

	public int getVehiclequa() {
		return vehiclequa;
	}

	public void setVehiclequa(int vehiclequa) {
		this.vehiclequa = vehiclequa;
	}

	// phuong thuc toString
	@Override
	public String toString() {
		return "Vehicle [vehicleid=" + vehicleid + ", vehiclename=" + vehiclename + ", vehicleprice=" + vehicleprice
				+ ", vehiclequa=" + vehiclequa + "]";
	}

	// phuong thuc getTotalvalues
	public abstract double getTotalValues();

}

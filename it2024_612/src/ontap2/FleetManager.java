package ontap2;

public interface FleetManager {
	public void addVehicle(Car v);

	public void removeVehicle(Car v);

	public Car serchVehicle(String name);

	public double getTotalFleetValues();
}

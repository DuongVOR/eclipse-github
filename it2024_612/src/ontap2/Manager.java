package ontap2;

import java.util.ArrayList;
import java.util.Collections;

public class Manager implements FleetManager {
	ArrayList<Car> car = new ArrayList<>();

	@Override
	public void addVehicle(Car v) {
		try {
			if (v != null)
				car.add(v);
			else
				throw new Exception("thon tin xe bi trong");
		} catch (Exception e) {
			System.out.println("Loi khi them" + e.getMessage());
		}

	}

	@Override
	public void removeVehicle(Car v) {

		try {
			if (v != null)
				car.remove(v);
			else
				throw new Exception("thon tin xe bi trong");
		} catch (Exception e) {
			System.out.println("Loi khi xoa" + e.getMessage());
		}
	}

	@Override
	public Car serchVehicle(String name) {
		try {
			for (Car i : car) {
				if (i.getVehiclename().equals(name))
					return i;
			}
			return null;
		} catch (Exception e) {
			System.out.println("Loi tim kiem" + e.getMessage());
			return null;
		}
	}

	@Override
	public double getTotalFleetValues() {
		double total = 0.0;
		try {
			for (Car i : car) {
				total += (double) (i.getTotalValues());
			}
			return total;
		} catch (Exception e) {
			System.out.println("Loi khi tinh tong tie" + e.getMessage());
		}
		return total;
	}

	// phuong thuc hien thi ra man hinh
	public void display() {
		for (Car i : this.car) {
			System.out.println(i);
		}
	}

	public void nameSort() {
		Collections.sort(car, new NameComparator());
	}

	public void SapXep() {
		Collections.sort(car, new ComparartoR());
	}
}

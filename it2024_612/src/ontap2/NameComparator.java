package ontap2;

import java.util.Comparator;

public class NameComparator implements Comparator<Car> {

	@Override
	public int compare(Car o1, Car o2) {
		return o1.vehiclename.compareTo(o2.vehiclename);
	}

}

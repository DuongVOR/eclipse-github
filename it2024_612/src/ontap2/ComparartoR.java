package ontap2;

import java.util.Comparator;

public class ComparartoR implements Comparator<Car> {
	public int compare(Car o1, Car o2) {
		if (o1.vehicleprice == o2.vehicleprice)
			return 0;
		else if (o1.vehicleprice > o2.vehicleprice)
			return 1;
		else
			return -1;
	}
}

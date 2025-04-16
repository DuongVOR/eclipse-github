package thu;

import java.util.ArrayList;

interface MobileManager {
	void addMobile(Mobile m);

	void delMobile(Mobile m);

	Mobile searchMobile(String name);

	double getTotalStorage();
}

class MobileManagerImpl implements MobileManager {
	private ArrayList<Mobile> mobiles = new ArrayList<>();

	@Override
	public void addMobile(Mobile m) {
		if (m != null) {
			mobiles.add(m);
		}
	}

	@Override
	public void delMobile(Mobile m) {
		mobiles.remove(m);
	}

	@Override
	public Mobile searchMobile(String name) {
		for (Mobile mobile : mobiles) {
			if (mobile.getProductName().equalsIgnoreCase(name)) {
				return mobile;
			}
		}
		return null; // Không tìm thấy
	}

	@Override
	public double getTotalStorage() {
		double total = 0.0;
		for (Mobile mobile : mobiles) {
			total += mobile.getTotalPrice();
		}
		return total;
	}

	public void display() {
		for (Mobile i : mobiles)
			System.out.println(i);
	}
}

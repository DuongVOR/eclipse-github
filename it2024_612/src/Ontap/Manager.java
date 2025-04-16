package Ontap;

import java.util.ArrayList;

public class Manager implements MobileManager {
	protected ArrayList<Mobile> a = new ArrayList<>();

	@Override
	public void addMobile(Mobile m) {
		try {
			if (m != null)
				this.a.add(m);
			else
				throw new Exception("San phan khong duoc null");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	@Override
	public void delMobile(Mobile m) {
		this.a.remove(m);
	}

	@Override
	public Mobile searchMobile(String m) {
		for (Mobile i : this.a) {
			if (i.getProduct_name() == m)
				System.out.println(i);
			else
				System.out.println("khong ton tai " + m);

		}
		return null;
	}

	@Override
	public double getTotalStorage(Mobile m) {
		double total = 0.0;
		try {
			for (Mobile i : a) {
				total += i.getTotalPrice();
			}
		} catch (Exception e) {
			System.out.println("Loi khi tinh" + e.getMessage());
		}
		return total;
	}

	public void display() {
		for (Mobile i : a) {
			System.out.println(i);
		}
	}

}

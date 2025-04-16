package Ontap;

public interface MobileManager {
	public void addMobile(Mobile m);

	public void delMobile(Mobile m);

	public Mobile searchMobile(String m);

	public double getTotalStorage(Mobile m);
}

package thu;

public class test {
	public static void main(String[] args) {
		MobileManagerImpl a = new MobileManagerImpl();
		Mobile b = new Mobile();
		b.setInfor();
		a.addMobile(b);
		a.display();
	}
}

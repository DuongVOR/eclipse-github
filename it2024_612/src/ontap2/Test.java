package ontap2;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Manager a = new Manager();
		Car b = new Car();
		Car c = new Car();
		Scanner sc = new Scanner(System.in);
		b.setInfor(sc);
		a.addVehicle(b);
		a.display();
		c.setInfor(sc);
		a.addVehicle(c);
		a.display();
//		System.out.println(a.getTotalFleetValues());
//		System.out.println(a.serchVehicle(sc.next()));
		a.nameSort();
		a.display();
		sc.close();
//		FileOutputStream cds = new FileOutputStream("test.txt");
//		FileInputStream cdd = new FileInputStream("test.txt");
	}
}

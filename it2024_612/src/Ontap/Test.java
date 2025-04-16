package Ontap;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Manager kh1 = new Manager();
		Scanner sc = new Scanner(System.in);
		Mobile a1 = new Mobile();
		Mobile a2 = new Mobile();
		a1.setInfor(sc);
		kh1.addMobile(a1);
		a2.setInfor(sc);
		kh1.addMobile(a2);
		kh1.display();
//		a1.setInfor();
//		kh1.addMobile();
		sc.close();
	}
}

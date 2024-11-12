package person;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Person[] p = new Person[10];
		Scanner sc = new Scanner(System.in);
		int i = 0, n;
		String a;
		char g;
		System.out.println("Nhap vao so luong sinh vien: ");
		n = sc.nextInt();
		while (i < n) {
			p[i] = new Person();
			System.out.println("Nhap vao ten nguoi thu " + (i + 1) + ":");
			a = sc.next();
			p[i].setName(a);
			System.out.println("Nhap vao ngay sinh nguoi thu " + (i + 1) + ":");
			a = sc.next();
			p[i].setDob(a);
			System.out.println("Nhap vao noi sinh nguoi thu " + (i + 1) + ":");
			a = sc.next();
			p[i].setPod(a);
			System.out.println("Nhap vao gioi tinh nguoi thu " + (i + 1) + ":");
			g = sc.next().charAt(0);
			p[i].setGender(g);
			System.out.println("Nhap vao email nguoi thu " + (i + 1) + ":");
			a = sc.next();
			p[i].setEmail(a);
			System.out.println("Nhap vao so dien thoai nguoi thu " + (i + 1) + ":");
			a = sc.next();
			p[i].setPhone(a);
			i++;
		}
		i = 0;
		while (i < n) {
			System.out.println("Nguoi thu" + (i + 1) + ": ");
			System.out.println("Ten:" + p[i].getName());
			System.out.println("Sinh ngay: " + p[i].getDob());
			System.out.println("Noi sinh: " + p[i].getPod());
			System.out.println("Gioi tinh: " + p[i].getGender());
			System.out.println("Dia chi Email: " + p[i].getEmail());
			System.out.println("So dien thoai: " + p[i].getPhone());
			i++;
		}
		sc.close();
	}
}

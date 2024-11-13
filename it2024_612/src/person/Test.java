package person;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Person[] p = new Person[10];
		Scanner sc = new Scanner(System.in);
		int i = 0;
		System.out.println("Nhap vao so luong sinh vien: ");
		int n = sc.nextInt();
		sc.nextLine();
		while (i < n) {
			p[i] = new Person();
			System.out.println("Nhap vao ten nguoi thu " + (i + 1) + ":");
			p[i].setName(sc.nextLine());
			System.out.println("Nhap vao ngay sinh nguoi thu " + (i + 1) + ":");
			p[i].setDob(sc.nextLine());
			System.out.println("Nhap vao noi sinh nguoi thu " + (i + 1) + ":");
			p[i].setPod(sc.nextLine());
			System.out.println("Nhap vao gioi tinh nguoi thu " + (i + 1) + ":");
			p[i].setGender(sc.nextLine().charAt(0));
			System.out.println("Nhap vao email nguoi thu " + (i + 1) + ":");
			p[i].setEmail(sc.nextLine());
			System.out.println("Nhap vao so dien thoai nguoi thu " + (i + 1) + ":");
			p[i].setPhone(sc.nextLine());
			System.out.println("Nhap vao tuoi nguoi thu " + (i + 1) + ":");
			p[i].setOld(sc.nextInt());
			sc.nextLine();
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
			System.out.println("Noi sinh: " + p[i].getOld());
			i++;
		}
		sc.close();
	}
}

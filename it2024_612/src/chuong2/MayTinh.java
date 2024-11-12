package chuong2;

import java.util.Scanner;

public class MayTinh {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char c;
		double a, b;
		// Nhap vao phep tinh va 2 so thuc
		do {
			System.out.println("Nhap vao phep tinh");
			System.out.println("Quy uoc: A la phep cong, S la phep tru, M la phep nhan, D la phep chia. ");
			c = sc.next().charAt(0);
			if (c != 'A' && c != 'S' && c != 'M' && c != 'D')
				System.out.println("Nhap lai!");
		} while (c != 'A' && c != 'S' && c != 'M' && c != 'D');
		System.out.println("Nhap vao so a: ");
		a = sc.nextDouble();
		System.out.println("Nhap vao so b: ");
		b = sc.nextDouble();
		// kiem tra ky tu vua nhap va in ra ket qua
		if (c == 'A')
			System.out.println("Ket qua la: " + (a + b));
		else if (c == 'S')
			System.out.println("Ket qua la: " + (a - b));
		else if (c == 'M')
			System.out.println("Ket qua la: " + (a * b));
		else if (c == 'D')
			System.out.println("Ket qua la: " + (a / b));
		sc.close();
	}
}

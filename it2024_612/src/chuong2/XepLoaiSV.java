package chuong2;

import java.util.Scanner;

public class XepLoaiSV {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.println("Nhap vao diem cua sinh vien(theo thang diem 100)");
		a = sc.nextInt();
		// Kiem tra xep loai cua sinh vien
		if (a < 50)
			System.out.println("Xep loai F");
		else if (a < 70)
			System.out.println("Xep loai D");
		else if (a < 80)
			System.out.println("Xep loai C");
		else if (a < 90)
			System.out.println("Xep loai B");
		else
			System.out.println("Xep loai A");
		sc.close();
	}
}

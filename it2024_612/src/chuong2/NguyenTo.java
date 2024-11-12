package chuong2;

import java.util.Scanner;

public class NguyenTo {
	// Ham kiem tra so nguyen to
	public static boolean nguyenTo(int a) {
		boolean b = true;
		int i = 2;
		while (b && i <= (int) Math.sqrt(a)) {
			if (a % i == 0)
				b = false;
			i++;
		}
		return b;
	}

	// Ham main
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.println("Nhap vao so can kiem tra: ");
		a = sc.nextInt();
		if (nguyenTo(a))
			System.out.print(a + " la so nguyen to");
		else
			System.out.print(a + " khong la so nguyen to");
		sc.close();
	}
}

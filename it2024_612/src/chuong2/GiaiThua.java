package chuong2;

import java.util.Scanner;

public class GiaiThua {
	public static long giaiThua(int a) {
		int i = 1, b = 1;
		while (i <= a) {
			b = i * b;
			i++;
		}
		return b;
	}

	public static void main(String[] args) {
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao so n: ");
		a = sc.nextInt();
		System.out.println("Giai thua cua " + a + " la: " + giaiThua(a));
		sc.close();
	}
}

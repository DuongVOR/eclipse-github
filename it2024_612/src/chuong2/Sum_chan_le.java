package chuong2;

import java.util.Scanner;

public class Sum_chan_le {
	public static long Sum(int a[], int n, byte i) {
		long t = 0;
		for (int j = 0; j < n; j++) {
			if (a[j] % (2 + i) == 0)
				t += a[j];
		}
		return t;
	}

	public static void main(String[] args) {
		int[] A = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
		int n = 12;
		boolean v = (n > 4) ? true : false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Tinh tong chan hay le (1 la le,0 la chan)?");
		byte a = sc.nextByte();
		System.out.println(Sum(A, n, a));
		sc.close();
	}
}

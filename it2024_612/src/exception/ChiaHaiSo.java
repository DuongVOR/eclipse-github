package exception;

import java.util.Scanner;

public class ChiaHaiSo {
	public static void main(String[] args) {
		int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao so a: ");
		a = sc.nextInt();
		System.out.println("Nhap vao so b: ");
		b = sc.nextInt();
		try {
			System.out.println("Ket qua la: " + a / b);
		} catch (ArithmeticException e) {
			System.out.println(e.toString());
		}
		System.out.println("End here");
		sc.close();
	}
}

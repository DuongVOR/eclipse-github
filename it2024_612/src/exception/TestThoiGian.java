package exception;

import java.util.Scanner;

public class TestThoiGian {
	public static void main(String[] args) throws InvalidDateException {
		Scanner sc = new Scanner(System.in);
		int day, year, month;
		System.out.println("Nhap ngay: ");
		day = sc.nextInt();
		System.out.println("Nhap thang: ");
		month = sc.nextInt();
		System.out.println("Nhap nam: ");
		year = sc.nextInt();
		ThoiGian tg = new ThoiGian(day, month, year);
		sc.close();
	}
}

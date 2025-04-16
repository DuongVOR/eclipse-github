package exception;

import java.util.Scanner;

public class TestThoiGian {
	public static void main(String[] args) throws InvalidDateException {
		Scanner sc = new Scanner(System.in);
		int day, year, month;
		ThoiGian tg = new ThoiGian();
		System.out.println("Nhap ngay: ");
		day = sc.nextInt();
		tg.setDay(day);
		System.out.println("Nhap thang: ");
		month = sc.nextInt();
		tg.setMonth(month);
		System.out.println("Nhap nam: ");
		year = sc.nextInt();
		tg.setYear(year);
		sc.close();
	}
}

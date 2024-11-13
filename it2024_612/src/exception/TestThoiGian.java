package exception;

import java.util.Scanner;

public class TestThoiGian {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int day, year, month;
		day = sc.nextInt();
		month = sc.nextInt();
		System.out.println("Nhap nam: ");
		year = sc.nextInt();
		ThoiGian tg = new ThoiGian();
		tg.setDay(day);
		tg.setMonth(month);
		tg.setYear(year);
		System.out.println(tg);
		sc.close();
	}
}

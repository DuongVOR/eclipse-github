package chuong2;

import java.util.Scanner;

public class EnglishExam {
	public static void main(String[] args) {
		Students[] s = new Students[100];
		Scanner sc = new Scanner(System.in);
		int n, d;
		String a;
		do {
			System.out.println("Nhap so luong sinh vien: ");
			n = sc.nextInt();
			if (n < 0 || n > 100)
				System.out.println("moi nhap lai!!");
		} while (n < 0 || n > 100);
		for (int i = 0; i < n; i++) {
			System.out.println("Sinh vien thu " + (i + 1));
			System.out.println("Nhap ten sinh vien: ");
			a = sc.nextLine();
			s[i].setName(a);
			System.out.println("Nhap so diem: ");
			d = sc.nextInt();
			s[i].setScore(d);
		}
		sc.close();
	}
}

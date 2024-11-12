package chuong2;

import java.util.Scanner;

public class TienPhong {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int gia, ngay;
		System.out.println("Nhap vao so ngay luu hanh: ");
		ngay = sc.nextInt();
		System.out.println("Nhap vao don gia: ");
		gia = sc.nextInt();
		if (ngay == 1)
			System.out.println("Don gia cua ban la: " + gia);
		else if (ngay <= 4 && ngay >= 2)
			System.out.println("Don gia cua ban la: " + (gia - (int) (gia * 1 / 5)));
		else if (ngay <= 10 && ngay >= 5)
			System.out.println("Don gia cua ban la: " + (gia - (int) (gia * 2 / 5)));
		else
			System.out.println("Don gia cua ban la: " + (gia - (int) (gia * 3 / 5)));
		sc.close();
	}
}

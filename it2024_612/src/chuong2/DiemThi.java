package chuong2;

import java.util.ArrayList;
import java.util.Scanner;

public class DiemThi {
	// phuong thuc sap xep bang phuong phap chen
	public static void InsertionSort(ArrayList<Integer> a, int n) {
		for (int i = 1; i < n; i++) {
			int b = a.get(i);
			int j = i - 1;
			while (j > -1 && a.get(j) >= b) {
				a.set(j + 1, a.get(j));
				j--;
			}
			a.set(j + 1, b);
		}
	}

	// in ra danh sach diem
	public static void InTT(ArrayList<Integer> A, int n) {
		int i = 0;
		System.out.println("Danh sach diem: ");
		while (i < n) {
			System.out.println(A.get(i) + " ");
			i++;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		// nhap vao so luong phan tu trong ds
		do {
			System.out.println("Nhap so luong diem: ");
			n = sc.nextInt();
			if (n < 0)
				System.out.println("Nhap lai!");
		} while (n < 0);
		ArrayList<Integer> a = new ArrayList<>();
		int i = 0;
		// Nhap vao cac phan tu trong ds
		while (i < n) {
			System.out.println("Nhap diem cua sinh vien thu " + (i + 1) + ": ");
			a.add(i, sc.nextInt());
			if (a.get(i) < 0 && a.get(i) > 100)
				System.out.println("Nhap lai diem(0-100 diem):");
			else
				i++;
		}
		System.out.println("Danh sach vua nhap: ");
		InTT(a, n);
		InsertionSort(a, n);
		System.out.println("Danh sach sau khi sap xep theo thu tu tang dan: ");
		InTT(a, n);
		sc.close();
	}

}

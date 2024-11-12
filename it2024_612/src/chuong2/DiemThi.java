package chuong2;

import java.util.Scanner;

public class DiemThi {
	// phuong thuc sap xep bang phuong phap chen
	public static void InsertionSort(int[] a, int n) {
		for (int i = 1; i < n; i++) {
			int b = a[i];
			int j = i - 1;
			while (j > -1 && a[j] >= b) {
				a[j + 1] = a[j];
				j--;
			}
			a[j + 1] = b;
		}
	}

	// in ra danh sach diem
	public static void InTT(int a[], int n) {
		int i = 0;
		System.out.println("Danh sach diem: ");
		while (i < n) {
			System.out.println(a[i] + " ");
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
		int a[] = new int[n];
		int i = 0;
		// Nhap vao cac phan tu trong ds
		while (i < n) {
			System.out.println("Nhap diem cua sinh vien thu " + (i + 1) + ": ");
			a[i] = sc.nextInt();
			if (a[i] < 0 && a[i] > 100)
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

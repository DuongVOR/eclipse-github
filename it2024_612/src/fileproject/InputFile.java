package fileproject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class InputFile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		File f = new File("exp.txt");
		try {
			FileReader in = new FileReader(f);
			FileWriter out = new FileWriter(f);
			PrintWriter p = new PrintWriter(out);
			BufferedReader r = new BufferedReader(in);
			System.out.println("Nhap vao mot chuoi ky tu");
			p.println(sc.nextLine());
			System.out.println("Nhap vao mot ky tu");
			p.println(sc.next());
			System.out.println("Nhap vao mot so nguyen");
			p.println(sc.nextInt());
			System.out.println("Nhap vao mot so thuc");
			p.println(sc.nextFloat());
			out.close();
			String s = r.readLine();
			System.out.println(s);
			String c = r.readLine();
			System.out.println(c);
			int i = Integer.parseInt(r.readLine());
			System.out.println(i);
			double d = Double.parseDouble(r.readLine());
			System.out.println(d);
			in.close();

		} catch (IOException e) {
			System.out.println(e);
		}

	}
}

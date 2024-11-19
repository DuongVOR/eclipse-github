package fileproject;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileTest {
	public static void main(String[] args) {
//		File f = new File("test.txt");
		FileWriter outf;
		PrintWriter out;
		Scanner sc = new Scanner(System.in);
		try {
			outf = new FileWriter("Test.txt");
			out = new PrintWriter(outf);
			out.println(sc.nextLine());
			out.println(sc.nextBoolean());
			out.println("Violets are ddddblue");
			outf.close();
		} catch (IOException e) {
			System.out.println(e.toString());
		}
	}
}

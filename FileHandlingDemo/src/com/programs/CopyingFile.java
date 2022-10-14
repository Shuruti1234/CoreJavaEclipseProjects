package com.programs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class CopyingFile {

	public static void copyData(File f1, File f2) throws IOException {

		FileInputStream fin = new FileInputStream(f1);
		FileOutputStream fout = new FileOutputStream(f2);

		// reading the data
		int i;
		while ((i = fin.read()) != -1) {
			fout.write(i);
		}

		System.out.println("Copied Success.......");

		fin.close();
		fout.close();
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		// creating object of Scanner
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of file1:");

		// opening a file
		String file1 = sc.nextLine();
		String file2;
		File f1 = new File("D:/Files/" + file1);
		// checking whether the file exist or not
		if (f1.exists()) {

			System.out.println("Enter the name of file2:");

			// opening a file
			file2 = sc.nextLine();
			File f2 = new File("D:/Files/" + file2);
			// calling method to copy the content
			copyData(f1, f2);
			sc.close();

		} else {
			System.out.println("File not found!!!!!!");
		}

	}

}

package com.programs;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the name of file:");

			// opening a file
			String file1 = sc.nextLine();
			File f1 = new File("D:/Files/" + file1);
			if (f1.exists()) {
				System.out.println("File already exists........");
			} else {
				f1.createNewFile();
				System.out.println("File created successfully........");

				// try with resources

				try (FileOutputStream fout = new FileOutputStream(f1)) {
					System.out.println("Enter the characters: enter null to exit>>>");
					String input;

					do {
						input = sc.nextLine();
						byte b[] = input.getBytes();
						fout.write((b));

					} while (!(input.equalsIgnoreCase("null")));
				}

			}
		}

	}

}

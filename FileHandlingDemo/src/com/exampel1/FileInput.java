package com.exampel1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInput {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		try {
			FileInputStream fin = new FileInputStream("D:/Files/test.txt");

			// to read only one character
//			int i = fin.read();
//			System.out.println((char)i);

			// to read all the contents from the file
			int i;
			while ((i = fin.read()) != -1) {
				System.out.print((char) i);
			}

			fin.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

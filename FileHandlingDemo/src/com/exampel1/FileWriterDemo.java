package com.exampel1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class FileWriterDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		try {
			Writer fw = new FileWriter("D:/Files/write.txt");
			String s = "My name is Shuruti";
			fw.write(s);
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			Reader fr = new FileReader("D:/Files/write.txt");
			int data;
			while ((data = fr.read()) != -1) {
				System.out.print((char) data);
			}
			fr.close();

		}

		catch (

		FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}

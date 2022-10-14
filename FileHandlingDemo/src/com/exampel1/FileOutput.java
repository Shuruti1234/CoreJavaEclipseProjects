package com.exampel1;

import java.io.BufferedOutputStream;
//importing packages
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.log4j.Logger;

//declaring class

public class FileOutput {

	// oject of logger for the class
	static Logger log = Logger.getLogger(FileOutput.class.getName());

	// main method
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		// creating s fileoutput stream
		FileOutputStream fout = null;

		try {

			// creating a file
			File f = new File("D:/Files/test.txt");
			if (!f.exists()) {
				f.createNewFile();
				// adding information to logger
				log.info("File created successfully :" + new java.util.Date());
			}
			fout = new FileOutputStream(f);
			BufferedOutputStream bout = new BufferedOutputStream(fout);

			// writing data in the file
			bout.write(78);

			// writing a string in file
			String s = "Hello There";
			byte b[] = s.getBytes();
			bout.write(b);

			log.info("Added text in the file :" + new java.util.Date());
			bout.flush();
			bout.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			log.error("Could not add in the file :" + new java.util.Date());
		}
		// try catch ends
		finally {
			fout.close();
			log.info("File closed successfully :" + new java.util.Date());

		}
		// finally ends

	}
	// main ends

}
//class ends

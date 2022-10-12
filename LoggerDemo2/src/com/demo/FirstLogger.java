package com.demo;

import java.io.IOException;
import java.sql.SQLException;

import org.apache.log4j.Logger;

//logger in permanent file
public class FirstLogger {

	static Logger log = Logger.getLogger(FirstLogger.class.getName());

	public static void main(String[] args) throws IOException, SQLException {
		// TODO Auto-generated method stub

		log.debug("I am debugging" + new java.util.Date());
		log.info("Hi I am Shuruti");

	}

}

/*
 * JavaBean Class: Country
 * @author: Shuruti Singhal
 * @Date: 25.10.22
 */

package com.CollectionsMap.Country;

//declaring class
public class CountryInformation {

	// instance variables
	private String countryName;

	private String countryCode;

	private String capital;

	// constructors
	public CountryInformation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CountryInformation(String countryName, String countryCode, String capital) {
		super();
		this.countryName = countryName;
		this.countryCode = countryCode;
		this.capital = capital;
	}

	// getters and setters

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}
	// toString method

	@Override
	public String toString() {
		return "CountryInformation [countryName=" + countryName + ", countryCode=" + countryCode + ", capital="
				+ capital + "]";
	}

}

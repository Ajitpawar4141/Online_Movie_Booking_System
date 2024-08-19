package com.project.Dto;

public class AddTheater {

	private String name;
	private String address;
	private String city;
	private int screens_count;
	private String facilities;
	private int counters_count;
	private int managerid;
	private String gstNumber;
	
	public AddTheater() {
		super();
	}
	
	
	
	public AddTheater(String name, String address, String city, int screens_count, String facilities,
			int counters_count, int managerid, String gstNumber) {
		super();
		this.name = name;
		this.address = address;
		this.city = city;
		this.screens_count = screens_count;
		this.facilities = facilities;
		this.counters_count = counters_count;
		this.managerid = managerid;
		this.gstNumber = gstNumber;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getScreens_count() {
		return screens_count;
	}



	public void setScreens_count(int screens_count) {
		this.screens_count = screens_count;
	}



	public int getCounters_count() {
		return counters_count;
	}



	public void setCounters_count(int counters_count) {
		this.counters_count = counters_count;
	}



	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public String getFacilities() {
		return facilities;
	}
	public void setFacilities(String facilities) {
		this.facilities = facilities;
	}
	public int getCountersCount() {
		return counters_count;
	}
	public void setCountersCount(int countersCount) {
		this.counters_count = countersCount;
	}
	public int getManagerid() {
		return managerid;
	}
	public void setManagerid(int managerid) {
		this.managerid = managerid;
	}
	public String getGstNumber() {
		return gstNumber;
	}
	public void setGstNumber(String gstNumber) {
		this.gstNumber = gstNumber;
	}
	}

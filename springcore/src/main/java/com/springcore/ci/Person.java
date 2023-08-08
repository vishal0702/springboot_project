package com.springcore.ci;

import java.util.List;

public class Person {

	private String name;
	private int personId;
	private Certi certi;
	private List<String> addressList;

	public Person(String name, int personId, Certi certi, List<String> addressList) {
		this.name = name;
		this.personId = personId;
		this.certi = certi;
		this.addressList = addressList;
	}

	@Override
	public String toString() {
		return this.name + " : " + this.personId + "\nCertification: {" + this.certi.name + "}" + "\nAddress: "
				+ this.addressList;
	}

}

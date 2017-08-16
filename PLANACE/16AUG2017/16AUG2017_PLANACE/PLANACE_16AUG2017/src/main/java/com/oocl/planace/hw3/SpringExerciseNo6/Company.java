package com.oocl.planace.hw3.SpringExerciseNo6;

public class Company {
	String companyName;
	String companyAddress;
	String companyNo;
	String employeeName;

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}


	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	
	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}

	public void setCompanyNo(String companyNo) {
		this.companyNo = companyNo;
	}

	public void getCompanyInfo() {
		System.out.println("Company Name: " + companyName);
		System.out.println("Company Address: " + companyAddress);
		System.out.println("Company Contact No.: " + companyNo);
		System.out.println("Company Employee Name: " + employeeName);
	}

}

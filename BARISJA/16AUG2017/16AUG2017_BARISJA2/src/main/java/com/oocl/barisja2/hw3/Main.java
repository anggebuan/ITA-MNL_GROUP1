package com.oocl.barisja2.hw3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("CompanyBean.xml");
		Company company = (Company) context.getBean("employee");
		company.geAllInfo();
	}
	
}
class Company{
	String companyName;
	String companyAddress;
	String companyNo;
	String employeeName;
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCompanyAddress() {
		return companyAddress;
	}
	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}
	public String getCompanyNo() {
		return companyNo;
	}
	public void setCompanyNo(String companyNo) {
		this.companyNo = companyNo;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public void geAllInfo() {
		System.out.println("Company Name: " + companyName);
		System.out.println("Company Address: " + companyAddress);
		System.out.println("Company Contact No.: " + companyNo);
		System.out.println("Company Employee Name: " + employeeName);
	}
}

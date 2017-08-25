package com.oocl.barceja2.sw2;

import java.util.ArrayList;
import java.util.List;

public class ProductsClass {

	List<String> bookList = new ArrayList<>();
	
	
	public ProductsClass(List<String> bl){
		this.bookList = bl;
	}
	
	public ProductsClass(){
		bookList.add("Harry porter and the 7 dwarves");
		bookList.add("Harry porter chamber of snakes");
		bookList.add("Harry porter and the prisoner of love");
		System.out.println(bookList);
	}
	
	public List<String> getBookList() {
		return bookList;
	}

	public void setBookList(List<String> bookList) {
		this.bookList = bookList;
	}

	
}

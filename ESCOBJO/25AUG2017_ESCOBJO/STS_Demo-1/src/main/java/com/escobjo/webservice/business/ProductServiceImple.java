package com.escobjo.webservice.business;

import java.util.*;

public class ProductServiceImple {

	List<String> bookList = new ArrayList<>();
	List<String> musicList = new ArrayList<>();
	List<String> movieList = new ArrayList<>();
	List<String> fastFoodList = new ArrayList<>();
	List<String> artsList = new ArrayList<>();
	
	public ProductServiceImple () {
		bookList.add("Bible");
		bookList.add("The Shell Seeker");
		bookList.add("The Heavenly Man");
		
		musicList.add("Hillsong United");
		musicList.add("Kari Jobe Songs");
		musicList.add("Meredith Andrew Songs");
		
		movieList.add("The Passion of Christ");
		movieList.add("Les Miserables");
		movieList.add("Camp Rock");
		
		fastFoodList.add("Shrimp Sinigang");
		fastFoodList.add("Nilagang Manok");
		fastFoodList.add("Ice cream");
		
		artsList.add("Acting");
		artsList.add("Singing");
		artsList.add("Dancing");
	}

	public List<String> getProductCategories() {

		List<String> categories = new ArrayList<>();
		categories.add("Books");
		categories.add("Music");
		categories.add("Movies");
		categories.add("FastFood");
		categories.add("Arts");
		return categories;
	}
	

	public List<String> getProducts (String category){
		switch (category.toLowerCase()) {
		case "books":
			return bookList;
		case "music":
			return musicList;
		case "movies":
			return movieList;
		case "fastFood":
			return fastFoodList;
		case "arts":
			return artsList;
		}
		return null;
		
	}
	
}

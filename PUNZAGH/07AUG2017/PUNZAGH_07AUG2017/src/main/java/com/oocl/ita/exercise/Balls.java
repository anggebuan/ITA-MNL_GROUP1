package com.oocl.ita.exercise;

import java.util.ArrayList;

public class Balls {


	private String weight;
	private boolean Original;
	
	


	public Balls(String weight, boolean original) {
		this.weight = weight;
		this.Original = original;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public boolean isOriginal() {
		return Original;
	}

	public void setOriginal(boolean original) {
		Original = original;
	}
}

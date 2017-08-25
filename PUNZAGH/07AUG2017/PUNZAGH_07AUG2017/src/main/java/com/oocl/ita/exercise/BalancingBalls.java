package com.oocl.ita.exercise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;


public class BalancingBalls {

	
	//Not completed
	public static void main(String[] args) {
		Map<Integer,Balls> ballArr = new HashMap<Integer,Balls>();
		//int numballs;
		
		for(int i =1;i<=12;i++) {
			ballArr.put(i,new Balls("Normal",true));
		}
		int randomNum = ThreadLocalRandom.current().nextInt(1, 12 + 1);
		String weight;
		if(ThreadLocalRandom.current().nextInt(1, 2 + 1)==1) {
			weight = "Light";
		}else {
			weight = "Heavy";
		}
		ballArr.put(randomNum, new Balls(weight,false));
		HashMap<Integer,HashSet> Hashmaps = new HashMap<Integer,HashSet>();
		for(int sets=1;sets<=3;sets++) {
			if(ballArr.size()%sets !=0) {
				
			}
		//	Hashsets.put(sets,new HashSet)
		}
//		HashSet<Balls> Hashseta = new HashSet<Balls>();
//		HashSet<Balls> Hashsetb = new HashSet<Balls>();
//		HashSet<Balls> Hashsetc = new HashSet<Balls>();
//		Hashseta.add(ballArr.get(1));
//		Hashseta.add(ballArr.get(2));
//		Hashseta.add(ballArr.get(3));
//		Hashseta.add(ballArr.get(4));
//		Hashseta.add(ballArr.get(5));
//		Hashseta.add(ballArr.get(6));
//		Hashseta.add(ballArr.get(7));
//		Hashseta.add(ballArr.get(8));
//		Hashseta.add(ballArr.get(9));
//		Hashseta.add(ballArr.get(10));
//		Hashseta.add(ballArr.get(11));
//		Hashseta.add(ballArr.get(12));
//		if(Hashseta.contains(ballArr.get(randomNum))){
//			
//		}
		
	}
	
	public Boolean isBalance(HashSet<Balls> seta,HashSet<Balls> setb) {
	//	if(seta.contains())
		return true;
	}
}

class WeighingScale{
	
	private String Possibility;
	
	private HashMap<Integer,Balls> hashball = new HashMap<Integer,Balls>();



	public String getPossibility() {
		return Possibility;
	}

	public void setPossibility(String possibility) {
		Possibility = possibility;
	}

	public HashMap<Integer,Balls> getHashball() {
		return hashball;
	}

	public void setHashball(HashMap<Integer,Balls> hashball) {
		this.hashball = hashball;
	}


	
}

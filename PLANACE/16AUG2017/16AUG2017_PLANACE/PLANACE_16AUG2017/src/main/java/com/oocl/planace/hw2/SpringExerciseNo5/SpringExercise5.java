package com.oocl.planace.hw2.SpringExerciseNo5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringExercise5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"/com/oocl/planace/hw2/SpringExerciseNo5/Beans.xml");
		NetworkManager netMgr = (NetworkManager) context.getBean("networkMgr");
		netMgr.doThings();
		context.destroy();
	}

}

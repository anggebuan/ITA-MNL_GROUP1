package com.oocl.escobjo;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import Exer5.Wk3exer5;
import Exer6.Wk3exer6Deadlocks;
import Exer8.Wk3exer8;

@Path("hello")

public class HelloResorce {
@GET
@Produces("text/plain")
@Path("exer8")
public String hello() {
	Wk3exer8 w = new Wk3exer8();

	return "Removed duplicate: " + w.main("Hello world");

	}



@GET
@Produces("text/plain")
@Path("exer5")
public String hello2() {
	Wk3exer5 w2 = new Wk3exer5();

	return "Removed spaces: " + w2.main("Hello world");

	}



@GET
@Produces("text/plain")
@Path("exer6")
public String hello3() {
	Wk3exer6Deadlocks w3 = new Wk3exer6Deadlocks();

	return "Number of deadlock(s): " + w3.main("1");

	}



}
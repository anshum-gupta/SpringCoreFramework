package com.anshum.firstMavenProject;

import org.springframework.stereotype.Component;


@Component
public class Car implements Vehicle{
	
	private Tyre tyre;
	
	public Tyre getTyre() {
		return tyre;
	}

	public void setTyre(Tyre tyre) {
		this.tyre = tyre;
	}

	public void drive() {
		System.out.println("Car is moving.." + (tyre == null ? "" : tyre.toString()));
	}
	
}

package com.iu.s2.util.token;

import javax.management.loading.PrivateClassLoader;

public class SeasonDTO {
	
	private String name;
	private int gion;
	public String getName() { //오버라이딩
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGion() {
		return gion;
	}
	public void setGion(int gion) {
		this.gion = gion;
	}

}
package com.ProjectdemoPackage.domain;

public class Players {
	private String name;
	private int age;
	private String club;
	private String position;
	private boolean retried;
	
	public Players()
	{
		
	}
	public Players(String name, int age, String club, String position, boolean retried) {
		super();
		this.name = name;
		this.age = age;
		this.club = club;
		this.position = position;
		this.retried = retried;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getClub() {
		return club;
	}
	public void setClub(String club) {
		this.club = club;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public boolean isRetried() {
		return retried;
	}
	public void setRetried(boolean retried) {
		this.retried = retried;
	}

}

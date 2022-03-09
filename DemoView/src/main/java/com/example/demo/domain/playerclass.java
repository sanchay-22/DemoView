package com.example.demo.domain;

public class playerclass {
private String name;
private int age;
private String club;
private String position;

public playerclass() {
	
}


public playerclass(String name, int age, String clug, String position, boolean currently, String club) {
	super();
	this.name = name;
	this.age = age;
	this.club = club;
	this.position = position;
	this.currently = currently;
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
public boolean isCurrently() {
	return currently;
}
public void setCurrently(boolean currently) {
	this.currently = currently;
}
private boolean currently;

}

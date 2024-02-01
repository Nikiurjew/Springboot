package com.example.demo.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class UserLocation {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;

private String name;
private double latitude;
private double longitude;
@Override
public String toString() {
	return "User_Location [id=" + id + ", name=" + name + ", latitude=" + latitude + ", longitude=" + longitude + "]";
}
public UserLocation() {
	super();
	// TODO Auto-generated constructor stub
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getLatitude() {
	return latitude;
}
public void setLatitude(double latitude) {
	this.latitude = latitude;
}
public double getLongitude() {
	return longitude;
}
public void setLongitude(double longitude) {
	this.longitude = longitude;
}
public UserLocation(int id, String name, double latitude, double longitude) {
	super();
	this.id = id;
	this.name = name;
	this.latitude = latitude;
	this.longitude = longitude;
}
}

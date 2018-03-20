package com.healthcare.bean;

public class UserOtherDetail {
int Uoid,User_id;
String Location,Standard,Handicap;
float latitude,longitude,temp_lat,temp_long;
public int getUoid() {
	return Uoid;
}
public void setUoid(int uoid) {
	Uoid = uoid;
}
public int getUser_id() {
	return User_id;
}
public void setUser_id(int user_id) {
	User_id = user_id;
}
public String getLocation() {
	return Location;
}
public void setLocation(String location) {
	Location = location;
}
public String getStandard() {
	return Standard;
}
public void setStandard(String standard) {
	Standard = standard;
}
public String getHandicap() {
	return Handicap;
}
public void setHandicap(String handicap) {
	Handicap = handicap;
}
public float getLatitude() {
	return latitude;
}
public void setLatitude(float latitude) {
	this.latitude = latitude;
}
public float getLongitude() {
	return longitude;
}
public void setLongitude(float longitude) {
	this.longitude = longitude;
}
public float getTemp_lat() {
	return temp_lat;
}
public void setTemp_lat(float temp_lat) {
	this.temp_lat = temp_lat;
}
public float getTemp_long() {
	return temp_long;
}
public void setTemp_long(float temp_long) {
	this.temp_long = temp_long;
}
}

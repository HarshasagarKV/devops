package com.wipro.MainModel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Mainmodel {
@Id
@Column(columnDefinition = "VARCHAR(25)")
private String name;
@Column(columnDefinition = "VARCHAR(25)")
private String dept;
@Column(columnDefinition = "VARCHAR(25)")
private String pass;
@Column(columnDefinition = "VARCHAR(25)")
private String bname;
@Column(columnDefinition = "VARCHAR(25)")
private String bid;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDept() {
	return dept;
}
public void setDept(String dept) {
	this.dept = dept;
}
public String getPass() {
	return pass;
}
public void setPass(String pass) {
	this.pass = pass;
}
public String getBname() {
	return bname;
}
public void setBname(String bname) {
	this.bname = bname;
}
public String getBid() {
	return bid;
}
public void setBid(String bid) {
	this.bid = bid;
}
}

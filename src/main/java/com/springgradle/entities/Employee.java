package com.springgradle.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "employeetable")
public class Employee {
String ename;
 @Id
 int eid;
 double esal;
public Employee() {
	super();
}
public Employee(String ename, int eid, double esal) {
	super();
	this.ename = ename;
	this.eid = eid;
	this.esal = esal;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public double getEsal() {
	return esal;
}
public void setEsal(double esal) {
	this.esal = esal;
}
@Override
public String toString() {
	return "Employee [ename=" + ename + ", eid=" + eid + ", esal=" + esal + "]";
}
 
}

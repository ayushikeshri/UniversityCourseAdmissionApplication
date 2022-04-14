//package com.springgradle.entities;
//
//import javax.persistence.CascadeType;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.OneToOne;
//import javax.persistence.PrimaryKeyJoinColumn;
//import javax.persistence.Table;
//import javax.validation.constraints.Min;
//import javax.validation.constraints.NotBlank;
//import javax.validation.constraints.Size;
//
//import org.checkerframework.checker.units.qual.min;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//@Entity
//@Table(name= "studenttable")
//public class Student {
//	String name;
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	@NotBlank
//	@Size(min=3,max=15,message="invalid length")
//	int id;
//	@Min(40)
//	double marks;
//	@OneToOne (cascade = CascadeType.ALL)
//	@JoinColumn(referencedColumnName = "city",name="city")
//	Address address;
//	public Student() {
//		super();
//	}
//	public Student(String name, int id, double marks, Address address) {
//		super();
//		this.name = name;
//		this.id = id;
//		this.marks = marks;
//		this.address = address;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
//	public double getMarks() {
//		return marks;
//	}
//	public void setMarks(double marks) {
//		this.marks = marks;
//	}
//	public Address getAddress() {
//		return address;
//	}
//	public void setAddress(Address address) {
//		this.address = address;
//	}
//	@Override
//	public String toString() {
//		return "Student [name=" + name + ", id=" + id + ", marks=" + marks + ", address=" + address + "]";
//	}
//	
//	
//
//}

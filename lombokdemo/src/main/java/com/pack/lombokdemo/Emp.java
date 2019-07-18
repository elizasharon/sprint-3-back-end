package com.pack.lombokdemo;

//import lombok.Data;
//
//import lombok.AllArgsConstructor;
//import lombok.EqualsAndHashCode;
//import lombok.Getter;
//import lombok.RequiredArgsConstructor;
//import lombok.Setter;
//import lombok.ToString;
import lombok.Value;

//@Getter
//@Setter
//@ToString
//@RequiredArgsConstructor
//@AllArgsConstructor
//@EqualsAndHashCode

//@Data
@Value
public class Emp {

	private String name;
	private int age;
	private float salary;
	private String Designation;
	

}

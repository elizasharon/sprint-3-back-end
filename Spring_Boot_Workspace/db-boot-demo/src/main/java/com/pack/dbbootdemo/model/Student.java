package com.pack.dbbootdemo.model;


import javax.persistence.*;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
@Entity
public class Student {

	@Id
	private int rollno;
	private String name;
	private String school;
}

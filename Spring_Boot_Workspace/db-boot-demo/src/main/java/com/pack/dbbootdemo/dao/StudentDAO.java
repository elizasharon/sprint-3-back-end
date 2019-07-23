package com.pack.dbbootdemo.dao;

import org.springframework.data.repository.CrudRepository;

import com.pack.dbbootdemo.model.Student;

public interface StudentDAO extends CrudRepository<Student, Integer>{

}

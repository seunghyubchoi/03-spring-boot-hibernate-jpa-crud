package com.luv2cod.cruddemo.dao;

import com.luv2cod.cruddemo.entity.Student;

import java.util.List;

public interface StudentDAO {

    void save(Student student);
    Student findById(Integer id);
    List<Student> findAll();
    List<Student> findByLastName(String theLastName);
}

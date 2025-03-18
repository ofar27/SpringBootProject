package com.ouissal.app.springapp.service;


import com.ouissal.app.springapp.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
}
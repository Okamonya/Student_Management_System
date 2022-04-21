package com.projects.sms.service;

import com.projects.sms.entity.Student;

import java.util.List;

public interface StudentService {

    List<Student> getAllStudents();

    Student saveStudent(Student student);
}


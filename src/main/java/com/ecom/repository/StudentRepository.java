package com.ecom.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.ecom.model.Student;


public interface StudentRepository extends JpaRepository<Student, Long>{

}
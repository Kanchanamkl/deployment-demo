package com.student.api.repository;

import com.student.api.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // Optional, but good practice
public interface StudentRepository extends JpaRepository<Student, Long> {
}
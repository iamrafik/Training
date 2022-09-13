package com.mindtree.StudentRecord.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.StudentRecord.Entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

	Student findStudentBystuId(int stuId);
}

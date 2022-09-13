package com.mindtree.Student.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.mindtree.Student.Entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
	Student findById(int stuId);

	@Query(value = "SELECT*FROM student WHERE colId=:colId ORDER BY stuName ASC", nativeQuery = true)
	List<Student> getByColId(@Param("colId") int colId);

	@Query(value = "SELECT*FROM student WHERE colId=:colId ORDER BY stuAge DESC", nativeQuery = true)
	List<Student> getStudentByCollegeWithDescAge(@Param("colId") int colId);
}

package com.mindtree.Students.repository;

import java.util.ArrayList;
import java.util.Iterator;


import org.springframework.stereotype.Component;

import com.mindtree.Students.Services.StuService;
import com.mindtree.Students.entity.Student;

@Component
public class StuRepository implements StuService {
	
	public ArrayList<Student> student=new ArrayList<Student>();
	

	public StuRepository() {
		student.add(new Student(1,"Rafik",28));
		student.add(new Student(2,"Islam",70));
		student.add(new Student(3,"Rafikul Islam",100));
	}


	public ArrayList<Student> getAll() {
				return student;
	}


	@Override
	public Student byId(int id) {
		// TODO Auto-generated method stub
		Iterator<Student> ir =student.iterator();
		while(ir.hasNext())
		{
			Student stu = ir.next();
			if(stu.getStuId()==id)
			{
				return stu;
			}
		}

			return null;
	}


	public void add(Student stu) {
		student.add(stu);
	}
}

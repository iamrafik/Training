package com.mindtree.College.ServiceImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.mindtree.College.Entity.College;
import com.mindtree.College.Repository.CollegeRepository;
import com.mindtree.College.Service.CollegeService;
import com.mindtree.College.StudentAndTemplate.RequestTemplate;
import com.mindtree.College.StudentAndTemplate.Student;

@Component
public class CollegeServiceImpl implements CollegeService {

	@Autowired
	CollegeRepository collegeRepository;
	@Autowired
	RestTemplate restTemplate;

	@Override
	public College add(College coll) {
		return collegeRepository.save(coll);
	}

	@Override
	public List<College> list() {
		return collegeRepository.findAll();
	}

	@Override
	public College searchById(int colId) {
		if (collegeRepository.findById(colId) == null) {
			return null;
		}
		return collegeRepository.findById(colId);
	}

	@Override
	public List<RequestTemplate> colListWithStudent() {
		List<RequestTemplate> totalList = new ArrayList<RequestTemplate>();
		List<College> colList = this.list();
		Iterator<College> itr = colList.iterator();
		while (itr.hasNext()) {
			College colge = itr.next();
			ResponseEntity<Student[]> rspns = restTemplate.getForEntity("http://STUDENT-SERVICE/student/student-with-ascname/"+colge.getColId(), Student[].class);
			Student[] student = rspns.getBody();
			List<Student> students = Arrays.asList(student);
			RequestTemplate rqtm = new RequestTemplate();
			rqtm.setCollege(colge);
			rqtm.setStudentList(students);
			totalList.add(rqtm);

		}
		return totalList;
	}

	@Override
	public RequestTemplate specificColByStudent(int colId) {
		College college = this.searchById(colId);
		ResponseEntity<Student[]> rspns = restTemplate.getForEntity("http://STUDENT-SERVICE/student/student-with-desc-age/"+college.getColId(), Student[].class);
		Student[] student = rspns.getBody();
		List<Student> students = Arrays.asList(student);
		RequestTemplate rqtplm = new RequestTemplate();

		rqtplm.setCollege(college);
		rqtplm.setStudentList(students);

		return rqtplm;
	}

}

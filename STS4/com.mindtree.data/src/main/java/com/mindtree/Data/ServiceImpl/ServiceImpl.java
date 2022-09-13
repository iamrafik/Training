package com.mindtree.Data.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mindtree.Data.Entity.Employee;
import com.mindtree.Data.Repository.EmpRepository;
import com.mindtree.Data.Service.EmployeeService;

@Component
public class ServiceImpl implements EmployeeService {

	@Autowired
	EmpRepository empRepo;

	@Override
	public List<Employee> allEmployee() {
		return empRepo.findAll();
	}

	@Override
	public Employee EmpById(int Id) {
		return empRepo.findById(Id);
	}

	@Override
	public Boolean addEmp(Employee emp) {
		try {
			empRepo.save(emp);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public String deleteEmp(int Id) {
		empRepo.deleteById(Id);
		return "Employee details deleted successfully";
	}

	@Override
	public String editEmp(Employee emp, int Id) {
		Optional<Employee> empd = Optional.ofNullable(empRepo.findById(Id));

		if (!empd.isPresent())
			return "Employee not found";

		emp.setEmpId(Id);
		empRepo.save(emp);
		return "Employee data update successfully";
	}

}

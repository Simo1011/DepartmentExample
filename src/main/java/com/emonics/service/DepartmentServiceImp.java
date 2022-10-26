package com.emonics.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emonics.model.Department;
import com.emonics.repository.DepartmentRepository;

@Service
public class DepartmentServiceImp implements DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository ;
	@Override
	public List<Department> fetchDepartmentList() {
	    
		return departmentRepository.findAll();
	}

}

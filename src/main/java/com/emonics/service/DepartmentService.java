package com.emonics.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.emonics.model.Department;
import com.emonics.repository.DepartmentRepository;

public interface DepartmentService  {

	List<Department> fetchDepartmentList ();
	
}

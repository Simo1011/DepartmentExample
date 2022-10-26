package com.emonics.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.emonics.service.DepartmentService;

@Controller
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;
	public DepartmentController() {
		// TODO Auto-generated constructor stub
	}@GetMapping("/")
	public String departmetList(Model model) {
		model.addAttribute("DepartemtList",departmentService.fetchDepartmentList());
		return "DepartmentList";
		
	}

}

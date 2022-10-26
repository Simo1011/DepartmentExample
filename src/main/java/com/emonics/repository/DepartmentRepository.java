package com.emonics.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.emonics.model.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long> {

}

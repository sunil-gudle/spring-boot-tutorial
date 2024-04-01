package com.dailycoding.springboottutorial.service;

import com.dailycoding.springboottutorial.entity.Department;
import com.dailycoding.springboottutorial.error.DepartmentNotFoundException;

import java.util.List;

public interface DepartmentService {

   public Department saveDepartment(Department department);

   public List<Department> fetchDepartmentList();

   public Department fetchDepartmentById(Long departmentId) throws DepartmentNotFoundException;

   public void deleteDepartmentById(Long departmentId);

   public Department updateDepartment(Long departmentId, Department department);

   public Department fetchDepartmentByName(String departmentName);
}

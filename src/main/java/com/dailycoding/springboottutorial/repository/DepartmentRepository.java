package com.dailycoding.springboottutorial.repository;

import com.dailycoding.springboottutorial.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

    public Department findByDepartmentNameIgnoreCase(String departmentName);
}

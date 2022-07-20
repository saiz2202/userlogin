package com.sathish.userlogin.service;

import com.sathish.userlogin.Repository.DepartmentRepository;
import com.sathish.userlogin.entity.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {

    private DepartmentRepository departmentRepository;

    @Autowired
    public void DepartmentService(DepartmentRepository departmentRepository){
        this.departmentRepository=departmentRepository;
    }

    public Department saveDepartment(Department department){
        departmentRepository.save(department);
        return department;
    }
}

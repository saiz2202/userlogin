package com.sathish.userlogin.controller;

import com.sathish.userlogin.entity.Department;
import com.sathish.userlogin.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {

    private DepartmentService departmentService;

    @Autowired
    public void DepartmentController(DepartmentService departmentService){
        this.departmentService=departmentService;
    }

    @RequestMapping(value = "/department/savedepartment",method = RequestMethod.POST)
    public ResponseEntity<Department> saveDepartment(@RequestBody  Department department){
        return new ResponseEntity<>(departmentService.saveDepartment(department), HttpStatus.OK);
    }
}

package com.commune.communepro.department.service;

import com.commune.communepro.department.domain.Department;
import com.commune.communepro.department.repository.DepartmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl {

    @Autowired
    DepartmentRepo departmentRepo;

    public List getAllDepartments(){
        return departmentRepo.getAllDepartments();
    }

    public boolean save(Department department){

        Department existingDepartment = departmentRepo.findByName(department.getDepartmentName());
        if(existingDepartment == null){
            departmentRepo.saveDepartment(department);
            return true;
        }
        else{
            return false;
        }
    }
}

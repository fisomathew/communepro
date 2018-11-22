package com.commune.communepro.department.repository;

import com.commune.communepro.department.domain.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DepartmentRepo {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List getAllDepartments()throws EmptyResultDataAccessException {
        String sql = "select * from department limit 100";
        List departmentList = jdbcTemplate.query(sql, new Object[]{},(rs, rowNum) -> new Department(
                rs.getInt("dept_id"),
                rs.getString("dept_name"),
                rs.getString("dept_desc")
        ));
        return departmentList;
    }

    public Department  findById(int deptId){
        Department department = null;
        try{
            department = jdbcTemplate.queryForObject("select * from department where dept_id=? limit 1", new Object[]{
                    deptId
            }, new BeanPropertyRowMapper<>(Department.class));
        }catch(Exception e){
            System.out.println("Exception Occured::Department with ID '"+deptId+"' doesn't exist");
        }
        return department;
    }

    public Department  findByName(String deptName){
        Department department = null;
        try{
            department = jdbcTemplate.queryForObject("select * from department where dept_name=? limit 1", new Object[]{
                    deptName
            }, new BeanPropertyRowMapper<>(Department.class));
        }catch(Exception e){
            System.out.println("Exception Occured::Department with name '"+deptName+"' doesn't exist");
        }
        return department;
    }
    public int saveDepartment(Department department){
        return jdbcTemplate.update("insert into department (dept_name,dept_desc) " + "values(?,?)",
                new Object[]{department.getDepartmentName(),department.getDepartmentDescription()});
    }
}

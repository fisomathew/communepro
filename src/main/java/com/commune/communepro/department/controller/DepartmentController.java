package com.commune.communepro.department.controller;

import com.commune.communepro.department.domain.Department;
import com.commune.communepro.department.service.DepartmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
@RequestMapping("/department")
public class DepartmentController {

    @Autowired
    DepartmentServiceImpl departmentService;

    @RequestMapping("/list")
    public ModelAndView departmentIndex(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("departments",departmentService.getAllDepartments());
        modelAndView.setViewName("department/department_index.html");
        return modelAndView;
    }
    @RequestMapping("/departmentlist")
    public ModelAndView departmentList(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("department/department_list.html :: list");
        return modelAndView;
    }
    @RequestMapping("/add")
    public ModelAndView departmentAdd(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("department", new Department());
        modelAndView.setViewName("department/department_add.html :: add");
        return modelAndView;
    }

    @PostMapping("/save")
    public ModelAndView saveLookup(@ModelAttribute("department") @Valid Department department) {
        ModelAndView modelAndView = new ModelAndView();

        boolean isSaved = departmentService.save(department);
        modelAndView.addObject("message", (isSaved)?"Department saved successfully":"Department with name already exist");

        modelAndView.setViewName("redirect:/department/list");
        return modelAndView;
    }
}

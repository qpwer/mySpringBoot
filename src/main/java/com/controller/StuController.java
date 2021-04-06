package com.controller;

import com.pojo.Student;
import com.service.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class StuController {
    @Autowired
    StuService stuService;
    @RequestMapping("/stus")
    public String selStudents(Model model){
        List<Student> stus = stuService.selStudents();
        model.addAttribute("stus",stus);
        return "stu/list.html";
    }
//    @GetMapping("/addStu")
//    public String toAddPage(Model model){
//
//        model.addAttribute("departments",departments);
//        return "emp/addEmp";
//    }
//    @PostMapping("/emp")
//    public String addEmp(Employee employee){
//        employeeDao.save(employee);
//        return "redirect:/emps";
//    }
//    @GetMapping("/emp/{id}")
//    public String toUpdate(@PathVariable("id")Integer id, Model model){
//        Employee employee = employeeDao.getEmployeeById(id);
//        model.addAttribute("emp",employee);
//        Collection<Department> departments=departmentDao.getDepartments();
//        model.addAttribute("departments",departments);
//        return "emp/update";
//    }
//    @PostMapping("/updateEmp")
//    public String updateEmp(Employee employee){
//        employeeDao.save(employee);
//        return "redirect:/emps";
//    }
//    @GetMapping("/delEmp/{id}")
//    public String delEmp(@PathVariable("id")Integer id){
//        employeeDao.delete(id);
//        return "redirect:/emps";
//    }
}

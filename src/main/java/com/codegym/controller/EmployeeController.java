package com.codegym.controller;

import com.codegym.model.Employee;
import com.codegym.service.EmployeeService;
import com.codegym.service.IEmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
    private static IEmployeeService employeeService = new EmployeeService();

    @RequestMapping("/view")
    public ModelAndView showList() {
        ModelAndView modelAndView = new ModelAndView("index");
        List<Employee> employeeList = employeeService.findAll();
        modelAndView.addObject("employees", employeeList);
        return modelAndView;
    }
    @GetMapping("/search")
    public ModelAndView search(@RequestParam String name){
        ModelAndView modelAndView = new ModelAndView("search");
        Employee employee = employeeService.findByName(name);
        modelAndView.addObject("employee",employee);
        return  modelAndView;
    }
}

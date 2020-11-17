package demoapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import demoapp.service.CreateEmployee;
import org.springframework.web.bind.annotation.RequestMapping;


import java.util.ArrayList;

@Controller
public class EmployeeController {

    @Autowired
    private CreateEmployee getEmployee;

    @RequestMapping("/")
    public String getAllEmployees(Model model) {

        ArrayList empList = getEmployee.createEmployee();

        model.addAttribute("employees", empList);

        return "list-employees";

    }

}

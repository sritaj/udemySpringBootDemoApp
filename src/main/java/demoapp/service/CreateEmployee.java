package demoapp.service;

import demoapp.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CreateEmployee {

    public ArrayList<Employee> createEmployee(){

        ArrayList<Employee> theEmployees = new ArrayList<>();

        Employee emp1 = new Employee(1, "Sritaj", "Patel", "sr@gmail.com");
        Employee emp2 = new Employee(2, "Swastik", "Patel", "st@gmail.com");
        Employee emp3 = new Employee(3, "Subham", "Patel", "sm@gmail.com");
        Employee emp4 = new Employee(4, "Guddi", "Patel", "gd@gmail.com");

        theEmployees.add(emp1);
        theEmployees.add(emp2);
        theEmployees.add(emp3);
        theEmployees.add(emp4);

        return theEmployees;

    }
}

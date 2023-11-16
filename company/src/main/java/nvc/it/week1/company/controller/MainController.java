package nvc.it.week1.company.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
 @Controller
public class MainController {
   
    @GetMapping("/employee")
    @ResponseBody
    public String employee(){
        return "employee";
    }

    @GetMapping("/employee/{id}")
    @ResponseBody
    public String employee(@PathVariable int id){
        return "Employee ID : "+id;

    }

    @GetMapping("/employee/name/{name}")
    @ResponseBody
    public String employee(@PathVariable String name){
        return "Employee Name : "+name;

    }

    @GetMapping("/employee/department/{department}")
    @ResponseBody
    public String employeeDepartment(@PathVariable String department){
        return "Employee Department : "+department;

    }

    @PostMapping("/employee")
    @ResponseBody
    public String createEmployee(@RequestBody String name){
        return "Create Employee Name : "+name;
    }
}

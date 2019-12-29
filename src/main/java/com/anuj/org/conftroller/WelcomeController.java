package com.anuj.org.conftroller;

import com.anuj.org.model.Employee;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ws")
public class WelcomeController {

    @RequestMapping("/test")
    public String test(){
        return  "hello web services is working !";
    }

    @RequestMapping("/employee/{id}")
    public Employee getAll() {

        return  new Employee("joy","kumar",1);
    }
}

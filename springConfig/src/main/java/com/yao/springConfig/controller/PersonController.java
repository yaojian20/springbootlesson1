package com.yao.springConfig.controller;

import com.yao.springConfig.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yaojian
 * @date 2020/5/10 21:42
 */

@RestController
public class PersonController {



    private final Person person;

    @Autowired
    public PersonController(Person person) {
        this.person = person;
    }


    @GetMapping("/person")
    public Person viewPerson(){
        return  person;
    }
}

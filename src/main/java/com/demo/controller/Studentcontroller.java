package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.Exception.AgeNotFoundException;
import com.demo.Exception.IdNotFoundException;
import com.demo.Exception.NameNotFoundException;
import com.demo.entity.Studententity;
import com.demo.service.Studentservice;

@RestController
@RequestMapping(value="/student")
public class Studentcontroller {
@Autowired
Studentservice ss;

@PostMapping(value="/stu1")
public String stu(@RequestBody List<Studententity> e) {
	return ss.getmob(e);
}

@GetMapping(value="/stu2/{a}")
public List<Studententity> name(@PathVariable String a) throws NameNotFoundException{
	return ss.stu1(a);
}
@GetMapping(value="/stu3/{b}")
public List<Studententity> stu4(@PathVariable int b) throws AgeNotFoundException{
	return ss.stu7(b);
}
@GetMapping(value="/stu4/{c}")
public List<Studententity> stu7(@PathVariable int c) throws IdNotFoundException {
	return ss.studs(c);	
}
}
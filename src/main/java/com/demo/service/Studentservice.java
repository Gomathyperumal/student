package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.Exception.AgeNotFoundException;
import com.demo.Exception.IdNotFoundException;
import com.demo.Exception.NameNotFoundException;
import com.demo.dao.Studentdao;
import com.demo.entity.Studententity;

@Service
public class Studentservice {
@Autowired
Studentdao sd;

public String getmob(List<Studententity> e) {
	// TODO Auto-generated method stub
	return sd.stu1(e);
}

public List<Studententity> stu1(String a) throws NameNotFoundException {
	// TODO Auto-generated method stub
	if(sd.stu3(a).isEmpty()) {
		throw new NameNotFoundException("not found");
	} else {
	return sd.stu3(a);
}
}

public List<Studententity> stu7(int b) throws AgeNotFoundException {
	// TODO Auto-generated method stub
	if(sd.stg(b).isEmpty()) {
		throw new AgeNotFoundException("not founded");
	}else {
	return sd.stg(b);
}
}

public List<Studententity> studs(int c) throws IdNotFoundException {
	// TODO Auto-generated method stub
	if(sd.stu(c).isEmpty()) {
		throw new IdNotFoundException("not founded");
	}else {
	return sd.stu(c);
}
}
}

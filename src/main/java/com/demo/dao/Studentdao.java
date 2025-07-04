package com.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.demo.entity.Studententity;
import com.demo.repository.Studentrepository;

@Repository
public class Studentdao {
@Autowired
Studentrepository sr;

public String stu1(List<Studententity> e) {
	// TODO Auto-generated method stub
	 sr.saveAll(e);
	 return "saved";
}

public List<Studententity> stu3(String a) {
	// TODO Auto-generated method stub
	return sr.stu5(a);
}

public List<Studententity> stg(int b) {
	// TODO Auto-generated method stub
	return sr.sty(b);
}

public List<Studententity> stu(int c) {
	// TODO Auto-generated method stub
	return sr.stuk(c);
}
}

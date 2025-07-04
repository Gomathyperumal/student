package com.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.demo.entity.Studententity;

public interface Studentrepository extends JpaRepository 
<Studententity,Integer> {

	@Query(value="SELECT e from Studententity e WHERE e.name=?1")
	List<Studententity> stu5(String a);

	//@Query(value="SELECT * from studentdetails WHERE age=?;",nativeQuery=true)
	@Query(value="SELECT e from Studententity e WHERE e.age=?1")
	List<Studententity> sty(int b);

	@Query(value="SELECT e from Studententity e WHERE e.id=?1")
	List<Studententity> stuk(int c);	
}
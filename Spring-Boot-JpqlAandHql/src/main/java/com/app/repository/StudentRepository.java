package com.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.app.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

	
	@Query("select s from Student s where s.name like concat('%', :name, '%')")
	List<Student> findStudentByNameThatMatch(@Param("name") String name);
	
	@Query("from Student s where s.age > :age")
	List<Student> findStudentsAgeGreaterThan(@Param("age") Integer age);
}

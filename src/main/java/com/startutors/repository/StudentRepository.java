package com.startutors.repository;

import org.springframework.data.repository.CrudRepository;
import com.startutors.model.Student;

public interface StudentRepository extends CrudRepository<Student, Integer> {

}

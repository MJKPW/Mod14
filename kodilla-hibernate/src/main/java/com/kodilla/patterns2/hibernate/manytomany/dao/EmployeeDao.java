package com.kodilla.patterns2.hibernate.manytomany.dao;

import com.kodilla.patterns2.hibernate.manytomany.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface EmployeeDao extends CrudRepository<Employee, Integer> {

    @Query
    List<Employee> findByLastName(@Param("LASTNAME") String lastname);

    @Query
    List<Employee> findEmployeeBySub(@Param("SUB") String lastname);
}

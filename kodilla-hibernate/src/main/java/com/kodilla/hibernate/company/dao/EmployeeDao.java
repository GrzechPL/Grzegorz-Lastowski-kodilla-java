package com.kodilla.hibernate.company.dao;

import com.kodilla.hibernate.company.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Repository
public interface EmployeeDao extends CrudRepository<Employee, Integer> {

    @Query
    List<Employee> retriveEmployeeWithSurname(@Param("SURNAME")String surname);

    @Query
    List<Employee> employeeSurname(@Param("employeeSurname")String employeeSurname);
}
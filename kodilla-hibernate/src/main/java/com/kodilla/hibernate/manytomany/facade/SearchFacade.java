package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.company.Company;
import com.kodilla.hibernate.company.Employee;
import com.kodilla.hibernate.company.dao.CompanyDao;
import com.kodilla.hibernate.company.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SearchFacade {

    @Autowired
    CompanyDao companyDao;

    @Autowired
    EmployeeDao employeeDao;

    public List<Company> searchCompany(String employeeSurname){

        employeeSurname = "%"+employeeSurname+"%";

        List<Company> companies = companyDao.partLettersCompany(employeeSurname);

        return companies;
    }

    public List<Employee> searchEmployee(String employeeName) {

        employeeName = "%" + employeeName + "%";

        List<Employee> employees = employeeDao.employeeSurname(employeeName);

        return employees;
    }
}

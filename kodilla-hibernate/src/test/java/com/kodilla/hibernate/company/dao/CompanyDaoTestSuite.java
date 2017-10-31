package com.kodilla.hibernate.company.dao;


import com.kodilla.hibernate.company.Company;
import com.kodilla.hibernate.company.Employee;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CompanyDaoTestSuite {

    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;

    @Test
    public void testEmployeeDaoSave() {

        //Given

        Employee employee = new Employee("Jan","Kowalski");
        Employee employee1 = new Employee("Tomasz","Rachoń");
        Employee employee2 = new Employee("Jan","Kowalski");
        Employee employee3 = new Employee("Marek","Kowalski");

        //When

        employeeDao.save(employee);
        employeeDao.save(employee1);
        employeeDao.save(employee2);
        employeeDao.save(employee3);
        List<Employee> resultlista = employeeDao.retriveEmployeeWithSurname("Kowalski");

        //Then
        Assert.assertEquals(3, resultlista.size());
    }

    @Test
    public void testCompanyDaoSave() {

        //Given

        Company company1 = new Company("Apple");
        Company company2 = new Company("Microsoft");
        Company company3 = new Company("apple");
        Company company4 = new Company("IBM");
        Company company5 = new Company("apple");

        //When

        companyDao.save(company1);
        companyDao.save(company2);
        companyDao.save(company3);
        companyDao.save(company4);
        companyDao.save(company5);

        List<Company> resultlista = companyDao.theFirstThreeCharacters("App");

        //Then
        Assert.assertEquals(1, resultlista.size());
    }
}



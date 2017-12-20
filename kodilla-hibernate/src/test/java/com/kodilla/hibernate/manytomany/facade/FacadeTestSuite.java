package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.company.Company;
import com.kodilla.hibernate.company.Employee;
import com.kodilla.hibernate.company.dao.CompanyDao;
import com.kodilla.hibernate.company.dao.EmployeeDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FacadeTestSuite {

    @Autowired
    SearchFacade searchFacade;

    @Autowired
    CompanyDao companyDao;

    @Autowired
    EmployeeDao employeeDao;

    @Test
    public void testCompany(){

        Company first = new Company("KowalskiSA");
        Company second = new Company("MalinowskiSA");
        Company third = new Company("DudaSA");

        companyDao.save(first);
        companyDao.save(second);
        companyDao.save(third);

        List<Company> st = searchFacade.searchCompany("ki");

        Assert.assertEquals(2,st.size());
        Assert.assertEquals("KowalskiSA",st.get(0).getName());

        companyDao.deleteAll();

    }
    @Test
    public void testEmployee(){


        Employee first = new Employee("Jan","Kowamilski");
        Employee second = new Employee("Tomasz","Dąbromiwski");
        Employee third = new Employee("Marian","Kusmider");

        employeeDao.save(first);
        employeeDao.save(second);
        employeeDao.save(third);

        List<Employee> mi = searchFacade.searchEmployee("mi");

        Assert.assertEquals(3,mi.size());
        Assert.assertEquals("Dąbromiwski",mi.get(1).getSurname());

        employeeDao.deleteAll();

    }

}

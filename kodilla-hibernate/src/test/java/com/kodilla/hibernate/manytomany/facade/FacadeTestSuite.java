package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.company.Company;
import com.kodilla.hibernate.company.dao.CompanyDao;
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

    @Test
    public void test(){

        Company first = new Company("First");
        companyDao.save(first);
        List<Company> st = searchFacade.searchCompany("st");
        Assert.assertEquals(st.size(),1);
        Assert.assertEquals("First",st.get(0).getName());

        companyDao.deleteAll();

    }

}

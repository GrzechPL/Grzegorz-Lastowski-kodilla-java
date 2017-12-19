package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.company.Company;
import com.kodilla.hibernate.company.dao.CompanyDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SearchFacade {

    @Autowired
    CompanyDao companyDao;

    public List<Company> searchCompany(String companyName){

        companyName = "%"+companyName+"%";

        List<Company> companies = companyDao.partLettersCompany(companyName);

        return companies;
    }

}

package com.kodilla.hibernate.company.dao;

import com.kodilla.hibernate.company.Company;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Repository
public interface CompanyDao extends CrudRepository<Company, Integer> {

    @Query(nativeQuery = true)
    List<Company> theFirstThreeCharacters(@Param("THETHREELETTERS")String thethreeletters);

    @Query
    List<Company> partLettersCompany(@Param("companyName")String companyName);
}
package com.kodilla.patterns2.hibernate.manytomany.dao;


import com.kodilla.patterns2.hibernate.manytomany.Company;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Transactional
@Repository
public interface CompanyDao extends CrudRepository<Company, Integer> {

    @Query
    List<Company> findByFirstThreeLetters(@Param("name") String name);

    @Query()
    List<Company> findCompanyBySubstring(@Param("SUB") String name);
}

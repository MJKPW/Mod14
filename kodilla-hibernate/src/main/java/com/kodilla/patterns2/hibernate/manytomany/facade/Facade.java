package com.kodilla.patterns2.hibernate.manytomany.facade;

import com.kodilla.patterns2.hibernate.manytomany.Company;
import com.kodilla.patterns2.hibernate.manytomany.Employee;
import com.kodilla.patterns2.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.patterns2.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Facade {

    private final EmployeeDao employeeDao;
    private final CompanyDao companyDao;

    @Autowired
    public Facade(EmployeeDao employeeDao, CompanyDao companyDao) {
        this.employeeDao = employeeDao;
        this.companyDao = companyDao;
    }

    public List<Employee> findEmployee(String sub) {
        return employeeDao.findEmployeeBySub(sub);
    }

    public List<Company> findCompany(String sub) {
        return companyDao.findCompanyBySubstring(sub);
    }

}

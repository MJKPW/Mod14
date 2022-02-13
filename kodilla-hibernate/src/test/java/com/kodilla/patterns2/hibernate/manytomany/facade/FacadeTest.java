package com.kodilla.patterns2.hibernate.manytomany.facade;

import com.kodilla.patterns2.hibernate.manytomany.Company;
import com.kodilla.patterns2.hibernate.manytomany.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class FacadeTest {

    @Autowired
    private Facade facade;

    @Test
    public void testCompanySearch() {
        //Given
        String substring = "Maeo";
        //When
        List<Company> companies = facade.findCompany(substring);
        //Then
        assertEquals(1, companies.size());
    }

    @Test
    public void testEmployeeSearch() {
        //Given
        String substring = "Fre";
        //When
        List<Employee> employees = facade.findEmployee(substring);
        //Then
        assertEquals(1, employees.size());
    }

}
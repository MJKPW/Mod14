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
        Company companies = facade.findCompany(substring);
        //Then
        assertEquals(129, companies.getId());
    }

    @Test
    public void testEmployeeSearch() {
        //Given
        String substring = "Fre";
        //When
        Employee employees = facade.findEmployee(substring);
        //Then
        assertEquals(45, employees.getId());
    }

    @Test
    public void testNotFound() {
        //Given
        String substring = "X";
        //When
        //Then
        assertThrows(NotFoundException.class, () -> {
           facade.findEmployee(substring);
        });
        assertThrows(NotFoundException.class, () -> {
            facade.findCompany(substring);
        });
    }

}
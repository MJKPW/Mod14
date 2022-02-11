package com.kodilla.patterns2.hibernate.manytomany.facade;

public class NotFoundException extends RuntimeException {

    public NotFoundException(String target) {
        super((target.equals("Employee")? "Employee not found": "Company not found"));
    }
}

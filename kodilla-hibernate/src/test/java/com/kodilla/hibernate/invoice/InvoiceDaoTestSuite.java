package com.kodilla.hibernate.invoice;

import com.kodilla.hibernate.invoice.dao.InvoiceDao;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Invoice invoice = new Invoice("12");
        Product firstProduct = new Product("dishwasher");
        Product secondProduct = new Product("toaster");
        Item firstItem = new Item(firstProduct, new BigDecimal(2400), 4, new BigDecimal(10));
        Item secondItem = new Item(secondProduct, new BigDecimal(200), 10, new BigDecimal(2));
        invoice.getItems().add(firstItem);
        invoice.getItems().add(secondItem);
        //When
        invoiceDao.save(invoice);
        //Then
        Assertions.assertNotEquals(0, invoice.getId());
        //CleanUp
        invoiceDao.deleteById(invoice.getId());
    }
}

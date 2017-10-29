package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private ItemDao itemDao;
    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    public void testItemDaoSave() {
        //Given

        Product product = new Product("Monitor LG");
        Item item1 = new Item(product,new BigDecimal(500),2,new BigDecimal(1000));

        //When
        itemDao.save(item1);

        //Then
        int id = item1.getId();
        Item readItem = itemDao.findOne(id);

        Assert.assertEquals(id, readItem.getId());

        //CleanUp
       // invoiceDao.delete(id);
    }
    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product product1 = new Product("Monitory LG");
        Product product2 = new Product("Monitory SONY");


        Item item1 = new Item(product1,new BigDecimal(500),2,new BigDecimal(1000));
        Item item2 = new Item(product1,new BigDecimal(500),2,new BigDecimal(1000));
        Item item3 = new Item(product2,new BigDecimal(700),3,new BigDecimal(2000));
        Item item4 = new Item(product2,new BigDecimal(700),3,new BigDecimal(2000));

        Invoice invoice1 = new Invoice("A/2018");


        item1.setInvoice(invoice1);
        item2.setInvoice(invoice1);
        item3.setInvoice(invoice1);
        item4.setInvoice(invoice1);


        //When
        invoiceDao.save(invoice1);

        //Then
        int id = invoice1.getId();
        Invoice readinvoice = invoiceDao.findOne(id);

        Assert.assertEquals(id, readinvoice.getId());

        //CleanUp
        // invoiceDao.delete(id);
    }
}

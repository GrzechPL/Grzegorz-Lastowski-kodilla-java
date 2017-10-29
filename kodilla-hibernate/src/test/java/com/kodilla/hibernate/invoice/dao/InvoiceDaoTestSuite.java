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
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;
    @Autowired
    private ItemDao itemDao;
    @Autowired
    private ProductDao productDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product product1 = new Product("Monitory LG");
        Product product2 = new Product("Monitory SONY");

        Item item1 = new Item(new BigDecimal(500),2,new BigDecimal(1000));
        Item item2 = new Item(new BigDecimal(500),2,new BigDecimal(1000));
        Item item3 = new Item(new BigDecimal(700),3,new BigDecimal(2000));
        Item item4 = new Item(new BigDecimal(700),3,new BigDecimal(2000));

        item1.setProduct(product1);
        item2.setProduct(product2);
        item3.setProduct(product1);
        item4.setProduct(product2);

        Invoice invoice1 = new Invoice("A/2019");
        Invoice invoice2 = new Invoice("B/2018");

        item1.setInvoice(invoice1);
        item2.setInvoice(invoice1);
        item3.setInvoice(invoice2);
        item4.setInvoice(invoice1);

        //When
        productDao.save(product1);
        productDao.save(product2);
        invoiceDao.save(invoice1);
        invoiceDao.save(invoice2);
        itemDao.save(item1);
        itemDao.save(item2);
        itemDao.save(item3);
        itemDao.save(item4);

        //productDao.save(product2);

        //Then
        int id = invoice2.getId();
        Invoice readinvoice = invoiceDao.findOne(id);

        String name = product1.getName();
        Product readproduct = productDao.findOne(1);

        int readitem = (int)itemDao.count();

        Assert.assertEquals(id, readinvoice.getId());
        Assert.assertEquals(name, readproduct.getName());
        Assert.assertEquals(4, readitem);

        //CleanUp
        productDao.deleteAll();
        invoiceDao.deleteAll();
        itemDao.deleteAll();
    }
}

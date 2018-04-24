package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.ContextHierarchy;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    ProductDao productDao;

    @Autowired
    ItemDao itemDao;

    @Autowired
    InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product product = new Product("Toy");
        Item item = new Item(product, new BigDecimal(100), 10, new BigDecimal(200));
        Invoice invoice = new Invoice("FV 01/01/2018");

        product.getItems().add(item);
        item.setProduct(product);
        invoice.getItems().add(item);
        item.setInvoice(invoice);

        //When
        productDao.save(product);
        int idProduct = product.getId();

        itemDao.save(item);
        int idItem = item.getId();
        int itemQuantity = item.getQuantity();

        invoiceDao.save(invoice);
        int idInvoice = invoice.getId();

        //Then
        Assert.assertNotEquals(0, idProduct);
        Assert.assertNotEquals(0, idItem);
        Assert.assertNotEquals(0, idInvoice);
        Assert.assertEquals(10, itemQuantity);

        //CleanUp
        try {
            productDao.delete(idProduct);
            itemDao.delete(idItem);
            invoiceDao.delete(idInvoice);
        } catch (Exception e) {

        }
    }
}

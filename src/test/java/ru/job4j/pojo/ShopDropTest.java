package ru.job4j.pojo;

import org.junit.Test;

import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ShopDropTest {

    @Test
    public void whenDropFirst() {
        Product[] products = new Product[2];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread" , 4);
        Product[] rsl = ShopDrop.leftShift(products, 0);
        assertThat(rsl[0].getName(), is("Bread"));
        assertThat(rsl[1], is(nullValue()));
    }

    @Test
    public void whenDropLast() {
        Product[] products = new Product[2];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread" , 4);
        Product[] rsl = ShopDrop.leftShift(products, 1);
        assertThat(rsl[0].getName(), is("Milk"));
        assertThat(rsl[1], is(nullValue()));
    }

    @Test
    public void whenDropIsOne() {
        Product[] products = new Product[3];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread" , 4);
        products[2] = new Product("Egg", 19);
        Product[] rsl = ShopDrop.leftShift(products, 1);
        assertThat(rsl[0].getName(), is("Milk"));
        assertThat(rsl[1].getName(), is("Egg"));
        assertThat(rsl[2], is(nullValue()));
    }

    @Test
    public void whenDropIsZero() {
        Product[] products = new Product[3];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread" , 4);
        products[2] = new Product("Egg", 19);
        Product[] rsl = ShopDrop.leftShift(products, 0);
        assertThat(rsl[0].getName(), is("Bread"));
        assertThat(rsl[1].getName(), is("Egg"));
        assertThat(rsl[2], is(nullValue()));
    }


}
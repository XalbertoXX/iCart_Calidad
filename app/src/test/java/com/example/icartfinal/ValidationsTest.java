package com.example.icartfinal;

import java.util.ArrayList;
import org.junit.Test;
import org.junit.Assert;

public class ValidationsTest {
    @Test
    public void checkProductsRepeatedTest(){
        Validations utils = new Validations();
        ArrayList<String> myArrayList = new ArrayList<>();
        myArrayList.add("Piña");
        myArrayList.add("Yogures");
        Assert.assertEquals(utils.checkProductsRepeated(myArrayList), false);
        ArrayList<String> myArrayList2 = new ArrayList<>();
        myArrayList2.add("Carne");
        myArrayList2.add("Carne");
        Assert.assertEquals(utils.checkProductsRepeated(myArrayList2), true);
    }
    @Test
    public void checkProductsQuantityTest(){
        Validations utils = new Validations();
        ArrayList<String> myArrayList = new ArrayList<>();
        myArrayList.add("Piña");
        myArrayList.add("Yogures");
        Assert.assertEquals(utils.checkProductsQuantity(myArrayList), 2);
        ArrayList<String> myArrayList2 = new ArrayList<>();
        Assert.assertEquals(utils.checkProductsQuantity(myArrayList2), 0);
    }

}

package com.example.icartfinal;

import java.util.ArrayList;

public class Validations {
    public boolean checkProductsRepeated(ArrayList<String> myArray) {
        return myArray.get(0).equals(myArray.get(1));
    }
    public int checkProductsQuantity(ArrayList<String> myArray) {
        return myArray.size();
    }
}

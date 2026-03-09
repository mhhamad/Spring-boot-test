package com.Second.SpringBoot_2;

import java.util.List;

public class Model {
    List<String> prodects = List.of("laptop", "mobile", "tv", "fridge");
    
    public List<String> getProdects() {
        return prodects;
    }

    public String getProdect(int id) {
        return prodects.get(id);
    }
}

package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class world {
    List<String> continnet = new ArrayList<>();

    public void addcontinnent(){
        continnet.add("Europa");
        continnet.add("NorthAmerika");
        continnet.add("Africa");
    }

    //dlaczego nie BigInteger skoro jest to liczba całkowita ???
    public BigDecimal getPeopleQuantity(){
       BigDecimal worldPeolpeQuantity = new BigDecimal("1000000000000000000000000000");
        return continnet.stream()
                .flatMap(user -> user.getFriends().stream())


    }
}

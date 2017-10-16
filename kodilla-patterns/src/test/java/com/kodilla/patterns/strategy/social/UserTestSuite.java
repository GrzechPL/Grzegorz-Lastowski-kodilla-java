package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies(){

        //Given
       User jan = new Millenials("Jan Kowalski");
       User tom = new YGeneration("Tomasz Malinowski");
       User gre = new ZGeneration("Grzegorz Brzęczyszczykiewicz");

       //When
        String janschouldshare =jan.predict();
        System.out.println("Jan używa: " + janschouldshare);
        String tomschouldshare =tom.predict();
        System.out.println("Tomasz używa: " + tomschouldshare);
        String greschouldshare =gre.predict();
        System.out.println("Grzegorz używa: " + greschouldshare);

        //Then
        Assert.assertEquals("Facebooka", janschouldshare);
        Assert.assertEquals("Snapchata", tomschouldshare);
        Assert.assertEquals("Twittera", greschouldshare);

    }
    @Test
    public void testIndividualSharingStrategy(){
        //Given
        User tom = new YGeneration("Tomasz Malinowski");

        //When
        String tomschouldBuy = tom.predict();
        System.out.println("Tom korzystał z : " + tomschouldBuy);
        tom.setSocialPublisher(new FacebookPublisher());
        tomschouldBuy = tom.predict();
        System.out.println("Tom teraz korzysta z :" + tomschouldBuy);

        //Then
        Assert.assertEquals("Facebooka", tomschouldBuy);
    }
    }


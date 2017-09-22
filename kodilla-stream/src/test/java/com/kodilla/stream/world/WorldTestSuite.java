package com.kodilla.stream.world;
import org.junit.*;
import java.math.BigDecimal;

public class WorldTestSuite {
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }
    @Test
    public void testGetPeopleQuantity(){
        //Given
        //tworze obiekt klasy Country z dwoma polami nameOfCountry,numberOfPeople
        Country pl =new Country("Polska", new BigDecimal("100000000000000020"));
        Country de =new Country("Niemcy", new BigDecimal("100000000000000020"));
        Country fr =new Country("Francja", new BigDecimal("100000000000000030"));
        Country st =new Country("Stany Zjednoczone", new BigDecimal("100000000000000040"));
        Country ko =new Country("Kongo", new BigDecimal("100000000000000050"));
        Country ni =new Country("Nigeria", new BigDecimal("100000000000000060"));

        //tworze obiekty klasy Continent z jednym polem nameOfContinent
        Continent europa = new Continent("Europa");
        Continent ameryka = new Continent("Ameryka");
        Continent afryka = new Continent("Afryka");

        //korzystam z metody addCountry klasy Continent
        //do obiektu europa klasy Continent dodaje obiekt klasy Country
        europa.addCountry(pl);
        europa.addCountry(de);
        europa.addCountry(fr);
        ameryka.addCountry(st);
        afryka.addCountry(ko);
        afryka.addCountry(ni);

        //tworze obiekt klasy World oraz dodaje obiekt klasy Continent
        World continent = new World();
        continent.addContinent(europa);
        continent.addContinent(ameryka);
        continent.addContinent(afryka);
        //When
        BigDecimal result = continent.getPeopleQuantity();
        //Then
        Assert.assertEquals(new BigDecimal ("600000000000000220"), result);
    }

}
package com.kodilla.stream.world;
import org.junit.*;
import java.math.BigDecimal;

public class WorldTestSuite {
    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }
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
        World world = new World();
        world.addContinent("Europa");
        world.addContinent("Ameryka");
        world.addContinent("Afryka");

        Continent continent = new Continent();
        continent.addCountry("Polska");
        continent.addCountry("Niemcy");
        continent.addCountry("USA");
        continent.addCountry("Kamerun");
        continent.addCountry("Francja");

        Country country1 =new Country("Polska", new BigDecimal("100000000000000010"));
        Country country2 =new Country("Niemcy", new BigDecimal("100000000000000020"));
        Country country3 =new Country("Francja", new BigDecimal("100000000000000030"));
        Country country4 =new Country("USA", new BigDecimal("100000000000000040"));
        Country country5 =new Country("Kongo", new BigDecimal("100000000000000050"));
        Country country6 =new Country("Nigeria", new BigDecimal("100000000000000060"));

        //When
        BigDecimal result = world.getPeopleQuantity();
        //Then
        Assert.assertEquals(new BigDecimal ("600000000000000210"), result);
    }

}
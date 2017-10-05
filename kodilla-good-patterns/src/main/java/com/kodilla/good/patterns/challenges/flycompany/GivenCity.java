package com.kodilla.good.patterns.challenges.flycompany;

public class GivenCity {

    String givencity;

    public GivenCity(String givencity) {
        this.givencity = givencity;
    }

    public String getGivencity() {
        return givencity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GivenCity givenCity = (GivenCity) o;

        return givencity != null ? givencity.equals(givenCity.givencity) : givenCity.givencity == null;
    }

    @Override
    public int hashCode() {
        return givencity != null ? givencity.hashCode() : 0;
    }
}

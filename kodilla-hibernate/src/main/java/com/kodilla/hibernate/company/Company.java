package com.kodilla.hibernate.company;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@NamedNativeQuery(
                name = "Company.theFirstThreeCharacters",
                query = "SELECT *COMPANY" +
                        "WHERE SUBSTRING (NAME 1,3) = :THETHREELETTERS",
                resultClass = Company.class
)
@Entity
@Table(name = "COMPANY")
public class Company {
    int id;
    String name;

    public Company(){

    }
    public Company(String name) {
        this.name = name;
    }
    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID", unique = true)
    public int getId() {
        return id;
    }
    @Column(name = "NAME")
    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}

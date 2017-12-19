package com.kodilla.hibernate.company;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
@NamedQueries({
@NamedQuery(
       name = "Employee.retriveEmployeeWithSurname",
       query = "FROM Employee WHERE surname = :SURNAME"
),
@NamedQuery(
        name = "Employee.employeeSurname",
        query = "FROM Employee WHERE surname LIKE :employeeSurname"
)
})

@Entity
@Table(name = "EMPLOYEE")
public class Employee {
    int id;
    String firstname;
    String surname;

    public Employee(){

    }

    public Employee(String firstname, String surname) {
        this.firstname = firstname;
        this.surname = surname;
    }
    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID", unique = true)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    @Column(name = "FIRSTNAME")
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    @Column(name = "SURNAME")
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}

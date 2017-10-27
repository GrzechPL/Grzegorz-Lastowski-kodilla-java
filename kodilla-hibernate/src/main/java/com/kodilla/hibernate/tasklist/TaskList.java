package com.kodilla.hibernate.tasklist;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

// @Entity informuje Hibernate że obiekty tej klasy beda utrwalane w bazie danych
@Entity
@Table(name = "TASKLISTS")
public class TaskList {

    int id;
    String listName;
    String description;

// bezparametrowy konstruktor potrzebny Hirernate do odczytywania obiektów danych z bazy
    public TaskList(){

    }

    public TaskList(String listName, String description) {
        this.listName = listName;
        this.description = description;
    }
    @Id
// @GeneratedValue Hibernate zajmie sie wyznaczaniem wartości tego pola
    @GeneratedValue
    @NotNull
    @Column(name = "ID",unique = true)
    public int getId() {
        return id;
    }
    @Column(name = "LISTNAME")
    public String getListName() {
        return listName;
    }
    @Column(name = "DESCRIPTION")
    public String getDescription() {
        return description;
    }
//settery wszystkiech pół wymagane przez Hibernate gdy oznaczany gettery zamiast pół adnotacjami
    public void setId(int id) {
        this.id = id;
    }

    public void setListName(String listName) {
        this.listName = listName;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

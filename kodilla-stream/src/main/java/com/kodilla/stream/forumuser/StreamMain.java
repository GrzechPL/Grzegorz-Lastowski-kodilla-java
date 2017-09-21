package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {

        Forum forum = new Forum();
        //inicjalizacja stream
            //zmiennej userMap o typie Map przypisujemy stream pobierany z metody getUserList()
            //xyz nazwa funkcji może jakakolwiek
        Map<Integer,ForumUser> userMap = forum.getUserList().stream()
                .filter(xyz -> xyz.getSex() == 'M')
                .filter(xyz -> xyz.getDateOfBirth().isBefore(LocalDate.now().minusYears(20)))
                .filter(xyz -> xyz.getPostCounter() > 0)
                //kolektory tworzą kolekcje wynikowe
                //wynikiem tego ma być kolekcja typu map
                //uzyta jest referencja klasy :: do metody, oraz funkcja
                //kluczem ma być metoda getUserId
                //wartością mapy ma być obiekt forum user
                .collect(Collectors.toMap(ForumUser::getUserId, forumUser -> forumUser));
        //drukowanie na konsoli
        System.out.println("# elements: " + userMap.size());
        //entrySet metoda zwraca kolekcje Set mapy
        userMap.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);

    }
}
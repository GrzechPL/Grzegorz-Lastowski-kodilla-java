package com.kodilla.patterns.prototype.library;

import com.kodilla.patterns.prototype.Prototype;

import java.util.HashSet;
import java.util.Set;
    //dziedziczenie po prototype
public final class Library extends Prototype {
        //zmiana pola na public
        String name;
        Set<Book> books = new HashSet<>();

        public Library(final String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public Set<Book> getBooks() {
            return books;
        }

        public void setName(String name) {
            this.name = name;
        }

        //dodatkowa metoda płytkiego klonowania
        public Library shallowCopy() throws CloneNotSupportedException {
            return (Library) super.clone();
        }

        public Library deepCopy() throws CloneNotSupportedException {
            Library clonedLibrary = (Library) super.clone();
            clonedLibrary.books = new HashSet<>();
                for(Book book : books) {
                    clonedLibrary.books.add(book);
                }
            return clonedLibrary;
    }
}
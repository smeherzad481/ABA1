package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddressBookTest {

    @Test
    void add() {
        AddressBook elements = new AddressBook();//Singleton constructor
        AddressEntry new_elements = new AddressEntry("sitara","Meherzad","1223 dddddd",
                                        "dddsa","ca",95205,"hhhhhhhhhhh","4444444");
        elements.add(new_elements);
        assertEquals(elements.find("Meherzad").get(0),new_elements);
    }

    @Test
    void list() {
    }

    @Test
    void remove() {
        AddressBook elements = new AddressBook();
        AddressEntry new_elements = new AddressEntry("sitara","Meherzad","1223 dddddd",
                "dddsa","ca",95205,"hhhhhhhhhhh","4444444");

        AddressEntry different_elements = new AddressEntry("john","jackson","1223 aaaaaa",
                "chshs","ca",95234,"hhhhhhhhhhh","4444444");
        elements.add(new_elements);
        elements.add(different_elements);
        elements.remove(elements.find("jackson").get(0));
        assertEquals(elements.getList().size(),1);
    }

    @Test
    void find() {
    }

    @Test
    void getList() {
    }
}
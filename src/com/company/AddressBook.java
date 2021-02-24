package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/**
 * The AddressBook class
 */
public class AddressBook {

    ArrayList<AddressEntry> elements = new ArrayList<>();
    public void add(AddressEntry item){
        elements.add(item);
    }
    public void list()
    {
        elements.sort(Comparator.comparing(AddressEntry::getLastName));
        for(int i=0; i< elements.size();i++)
        {
            System.out.println(elements.get(i).toString());
        }
    }

    public void remove(AddressEntry entry)
    {
        elements.remove(entry);

    }
    public ArrayList<AddressEntry> getList()
    {
        return elements;
    }
    public ArrayList<AddressEntry> find(String lastName)
    {
        ArrayList<AddressEntry> results = new ArrayList<>();
        for(int i = 0; i < elements.size();i++)
        {
            if(elements.get(i).getLastName().startsWith(lastName))
            {
                results.add(elements.get(i));
            }

        }
        return results;
    }
}



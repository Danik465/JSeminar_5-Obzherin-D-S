package ru.gb.jseminar;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ListMultimap;
import com.google.common.collect.Multimap;

import java.util.Map;

public class PhoneBook {
    ListMultimap<String, String> multimap = ArrayListMultimap.create();
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("John", "33344");
        phoneBook.add("Peter", "344");
        phoneBook.add("Peter", "344333");
        phoneBook.add("Philipp", "344");
        phoneBook.add("Philipp", "122");
        System.out.println(phoneBook.multimap);

    }
    public void add(String number, String name) {
        multimap.put(number, name);
    }


}

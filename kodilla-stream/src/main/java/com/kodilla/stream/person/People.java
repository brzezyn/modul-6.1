package com.kodilla.stream.person;

import java.util.ArrayList;
import java.util.List;

public final class People {

    public static List<String> getList() {
        final List<String> theList = new ArrayList<>();

        theList.add("Jhon Smith");
        theList.add("Dorothy Newman");
        theList.add("Jhon Wolkowitz");
        theList.add("Lucy Riley");
        theList.add("Owen Rogers");
        theList.add("Matilda Davis");
        theList.add("Declan Booth");
        theList.add("Corinne Foster");
        theList.add("Khloe Fry");
        theList.add("Martin Valenzuela");

        return new ArrayList<>(theList);
    }
}

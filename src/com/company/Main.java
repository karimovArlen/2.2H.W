package com.company;

public class Main {

    public static void main(String[] args) {
        Dad[] arrayDad = {createObject("Eldest_Son"), createObject("Daughter"), createObject("Younger_Son")};
        for (Dad a : arrayDad) {
            a.print();

        }

    }

    public static Dad createObject(String className) {
        switch (className) {
            case "Eldest_Son":
                Eldest_Son kumar = new Eldest_Son(19, "Kumar", 185);
                return kumar;
            case "Daughter":
                Daughter bema = new Daughter(13, "Bema", "drawing");
                return bema;
            case "Younger_Son":
                Younger_Son alihan = new Younger_Son(8, "ALihan", "Samsung");
                return alihan;
        }
        return null;
    }
}


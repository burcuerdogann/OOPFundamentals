package com.burcuerdogan.oopfundamentals;

public class Musician {

    //Property (Private)

    private String name;
    private String instrument;
    private int age;


    //Constructor (Public)

    public Musician(String name, String instrument, int age) {
        this.name = name;
        this.instrument = instrument;
        this.age = age;
    }


    //Getter & Setter (Bilgiyi Al & Bilgiyi Yeniden Set Et)

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInstrument() {
        return instrument;
    }

    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }

    public int getAge() {
        return age;
    }

    //Bilgiyi Yeniden Set Ettirme için Koşul Belirleme

    public void setAge(int age, String password) {
        if (password.matches("I Hate Passwords!")) {
            this.age = age;

        }
    }
}
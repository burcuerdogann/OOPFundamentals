package com.burcuerdogan.oopfundamentals;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.sql.SQLOutput;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        User myUser = new User("Burcu", "Entreprenuer");
        System.out.println(myUser.name);
        System.out.println(myUser.information());

        //Encapsulation

        Musician myMusician1 = new Musician("James", "Guitar", 50);
        System.out.println(myMusician1.getName());
        myMusician1.setAge(60, "I Hate Passwords!");
        System.out.println(myMusician1.getAge());

        //Inheritance

        MetalheadMusician Lars = new MetalheadMusician("Lars", "Drum", 55);
        System.out.println(Lars.getAge());
        System.out.println(Lars.sing());

        //Polymorphism

        //Static Polymorhism (Method isimleri aynı yaptıkları işlemler farklı)

        Mathematics mathematics = new Mathematics();
        System.out.println(mathematics.sum());
        System.out.println(mathematics.sum(5, 3));
        System.out.println(mathematics.sum(5, 3, 4));

        //Dynamic Polymorhism

        Animal myAnimal = new Animal();
        myAnimal.mammalType();

        Dog Dragon = new Dog();
        Dragon.test();
        Dragon.mammalType();

        //Abstract & Interface

        Piano myPiano = new Piano();
        myPiano.brand = "Yamaha";
        myPiano.digital = true;
        myPiano.info();

    }

}
package peaksoft;

import java.util.Arrays;
import java.util.Scanner;
import java.util.SortedMap;

public class Main {

    public static void main(String[] args) {

        Fish fish = new Fish();
        fish.setVid("семга");
        fish.setColour("оранжевый");
        fish.setSize(25);

        System.out.println("вид: "+fish.getVid());
        System.out.println("цвет: "+fish.getColour());
        System.out.println("размер: "+fish.getSize());
        Fish.swim();
        Fish.eat();
        System.out.println("------------------------------");


        Parrot parrot = new Parrot();
        parrot.setName("Пума");
        parrot.setVid("Корелла");
        parrot.setColour("серебристый");
        parrot.setSize(32);


        System.out.println("вид: "+parrot.getVid());
        System.out.println("имя: "+parrot.getName());
        System.out.println("цвет: "+parrot.getColour());
        System.out.println("размер: "+parrot.getSize());
        Parrot.fly();
        Parrot.repeat();

        System.out.println("________________________________________________");

        Dog dog = new Dog();
        dog.setBreed(" немецкая овчарка");
        dog.setName("Рекс");
        dog.setWeight(40);

        System.out.println("порода: "+dog.getBreed());
        System.out.println("имя: "+dog.getName());
        System.out.println("вес: "+dog.getWeight());

        Dog.guard();
        Dog.run();
        System.out.println("_________________________________________________________");


        Cat cat = new Cat();
        cat.setBreed("Египетский Сфинкс");
        cat.setName("Мяу");
        cat.setYears(7);

        System.out.println("порода: "+cat.getBreed());
        System.out.println("имя: "+cat.getName());
        System.out.println("возраст: "+cat.getYears());

        Cat.play();
        Cat.sleep();



    }
}




package com.liu.day02.q1;

public class Test {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal sheep = new Sheep();
        Animal frog = new Frog();

        Breeder breeder = new Breeder();
        dog.swimming();
        breeder.breed(dog);
        breeder.breed(sheep);
        frog.swimming();
        breeder.breed(frog);

    }
}

package edu.a_level.inheritance;

public class Dog extends Animal {
    public Dog(String name, Integer age) {
        super(name, age);
    }

    @Override
    public void live() {
        System.out.println("Dog lives");
    }

    @Override
    public void eat(String food) {
        System.out.printf("Dog eats %s\n", food);
    }

    @Override
    public void voice() {
        System.out.println("Dog says WOOF");

    }

    public void printData() {
        System.out.println(name);
        System.out.println(super.getType());
    }
}

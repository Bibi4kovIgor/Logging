package edu.a_level.inheritance;


public class Cat extends Animal {

    public Cat(String name, Integer age) {
        super(name, age);
    }


    @Override
    public void live() {
        System.out.println("Cat lives");
    }

    @Override
    public void eat(String food) {
        System.out.printf("Cat eats %s\n ", food);

    }

    @Override
    public void voice() {
        System.out.println("Cat says MEOW!");
        name = "Hey!";
    }

}

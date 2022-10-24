package edu.a_level.inheritance;

public class Kittie extends Cat {

    public Kittie(String name, Integer age) {
        super(name, age);
    }

    public Kittie(String name) {
        this(name, 4);
    }

    public Kittie() {
        this("Ann", 4);
    }


    public void getVaccine(){
        System.out.println("Kitty was vaccinated");
    }

    // overwrite
    public <T, R> void eat (T food1, R food2) {
        System.out.printf("Template %s\n ", food1);
        System.out.printf("Template 2 %s\n ", food2);
    }

    public void eat (String food1, String food2) {
        System.out.printf("Template %s ", food1);
        System.out.printf("Template 2 %s ", food2);
    }


    // overload
    public void eat() {
        System.out.println("Kitty eats chicken");
    }

    @Override
    public void eat(String food) {
        super.eat(food);
    }
}

package edu.a_level.inheritance;

import java.io.IOException;

public abstract class Animal implements Alive{
    protected String name;
    protected int age;

    @Override
    public abstract void live();


    @Override
    public void close() throws IOException {

    }

    @Override
    public void run() {

    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    protected abstract void eat(String food);

    public abstract void voice();

}

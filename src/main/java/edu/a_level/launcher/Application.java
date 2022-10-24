package edu.a_level.launcher;

import edu.a_level.inheritance.Alive;
import edu.a_level.inheritance.Cat;
import edu.a_level.inheritance.Dog;
import edu.a_level.inheritance.Kittie;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Application {

    private static final Logger logger = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {

        logger.debug("Some Debug message");

        logger.warn("Some warning method");

        logger.error("Some error message");
        Cat cat = new Cat("Garfield", 1);
        Dog dog = new Dog("Scooby-do",2 );

        cat.eat("some meat");
        cat.voice();
        System.out.println(cat.getType1());

        dog.eat("chicken");
        dog.voice();
        dog.printData();

        Kittie kittie = new Kittie("Minnie", 1);
        kittie.getVaccine();

        kittie.eat();
        kittie.eat("fish");

        kittie.live();

        System.out.println(Alive.getType3());
        System.out.println(kittie.getType1());

        kittie.eat("Marine", "25");
        kittie.eat("Marine", 25);

        System.out.println(Alive.getType3());
        System.out.println(kittie.getType1());
        System.out.println(Alive.getType3());


    }

    private static void setI (Integer i) {
        int i1 = i;
    }
}

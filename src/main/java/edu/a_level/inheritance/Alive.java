package edu.a_level.inheritance;

import java.io.Closeable;

public interface Alive extends Closeable, Runnable {

    void live();

    String type = "custom";
    String type1 = "custom1";
    default String getType() {
        return type;
    }

    default String getType1() {
        return type1;
    }

    static String getType3(){
        return "any";
    }
}

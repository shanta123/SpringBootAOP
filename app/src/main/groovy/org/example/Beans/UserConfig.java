package org.example.Beans;

public class UserConfig {
    private String name;
    private String className;

    //Injecting the value through setter methods - setter injection
    //Create Bean using above values and set through setters
    public void setName(String name) {
        this.name = name;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}

package model;

public class Turtle extends Animal {
    public Turtle (String name) {
        super(name);
    }
    public Turtle () {
        // setName("Turtle");
        super("Turtle");
    }
    @Override
    public void say() {
        System.out.println("i am turtle");
    }
    public void createEgg () {

    }
}

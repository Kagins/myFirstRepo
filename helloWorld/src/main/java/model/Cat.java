package model;

public class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("I am cat");
    }

    @Override
    public void say() {
        System.out.println("meow");
    }
}

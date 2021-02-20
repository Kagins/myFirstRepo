package model;

public class Animal {

    public Animal (String name) {
        this.name = name;
    }
    public Animal () {

    }
    private String name = "animal1";

    public void getAnimalName () {
        System.out.println(name);
    }

    public void say() {
        System.out.println("i am animal");
    }
    public void say(String word) {
        System.out.println(word);
        this.say();
    }
//    TODO LEARN WHAT IS OVERLOAD, DIFFS BETWEEN OVERLOAD AND OVERRIDE
//    public void processRequest(String payload) {
//        System.out.println(payload);
//    }
//
//    public  void processRequest(String payload, boolean end) {
//        if(end) {
//            System.out.println("ENDED");
//        } else {
//            processRequest(payload);
//        }
//
//    }

    public void eat() {
        System.out.println("nam nam");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void doTrick(final String command) {
    System.out.println("doing " + command);
    }
}

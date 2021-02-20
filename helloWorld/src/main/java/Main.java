import model.Animal;
import model.Cat;
import model.Turtle;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Gay detected");
//        try {
//            System.in.read();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        int a = 2;
//        int b = 3;
//        Integer c = 2;
//        System.out.println(c & b);
        Animal dog = new Animal("dog");
        dog.getAnimalName();
        dog.doTrick("spin");
        dog.eat();
        dog.say();
        dog.say("I love you");
        Cat cat = new Cat("cat");
        cat.getAnimalName();
        cat.say();
        cat.eat();
        Turtle turtle = new Turtle();
        Animal cat2 = new Cat("cat2");
        test(turtle);
        test(cat2);
    }

    public static void test (Animal a) {
        a.say();
    }

}

package prototype.animation;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private static List<Person> frames = new ArrayList<>();

public static void animate() throws InterruptedException {
        System.out.println("****************************");
        System.out.println("* ");
        System.out.println("* Adjust your sleep's height");
        System.out.println("* ");
        System.out.print("****************************");
        Thread.sleep(3000);
        for (Person frame : frames) {
            frame.draw();
            Thread.sleep(500);
        }
        System.out.println("****************************");
        System.out.println("* ");
        System.out.println("* The End!");
        System.out.println("* ");
        System.out.print("**********************");
    }
    public static Person addLeft(Person p) throws CloneNotSupportedException{
        Person person = (Person) p.clone();
        frames.add(person);
        return person;

    }
    public static Person addRight(Person p) throws CloneNotSupportedException{
        Person person = (Person) p.clone();
        frames.add(person);
        return person;
    }

    public static void main(String[] args) throws CloneNotSupportedException,InterruptedException{

        PersonSamples samples = new PersonSamples();
        Person person = samples.get("woman");
       // Person person = samples.get("men");
        frames.add(person);
        person = addLeft(person);
        person = addLeft(person);
        person = addLeft(person);
        person = addRight(person);
        person = addRight(person);
        person = addRight(person);
        person = addRight(person);
        person = addRight(person);
        person = addRight(person);
        person = addRight(person);
        person = addLeft(person);
        person = addLeft(person);
        person = addLeft(person);
        animate();


    }
}

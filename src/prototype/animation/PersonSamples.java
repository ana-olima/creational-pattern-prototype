package prototype.animation;

import java.util.HashMap;
import java.util.Map;

public class PersonSamples {

    private Map<String, Person> samples;

    public PersonSamples(){
        samples = new HashMap<>();
        loadSamples();
    }
    public Person get(String type){
        return samples.get(type);
    }
    public void loadSamples(){
        samples.put("woman",  new Person(
                "                   ",
                "        o          ",
                "       /°°|\\          ",
                "_______/_\\___________"

        ));
        samples.put("men", new Person(
                "                   ",
                "        o          ",
                "       /|\\          ",
                "_______/_\\___________"
        ));
    }
}

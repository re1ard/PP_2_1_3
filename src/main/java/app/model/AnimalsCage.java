package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AnimalsCage {

    @Autowired
    @Qualifier("cat")
    private Animal animal_1;

    @Autowired
    @Qualifier("dog")
    private Animal animal_2;

    @Autowired
    private Timer timer;

    public Timer getTimer(){
        return timer;
    }

    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animal_1 + " - " + animal_2);
        System.out.println("At:");
        System.out.println(timer.getTime());
        System.out.println("________________________");
    }
}

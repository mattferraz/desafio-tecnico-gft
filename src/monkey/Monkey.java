package monkey;

import java.util.ArrayList;
import java.util.List;

public class Monkey {
    private String name;
    private final List<String> stomach;

    public Monkey() {
        this.stomach = new ArrayList<>();
    }

    public void eat(String food) {
        if (stomach.size() < 3) {
            stomach.add(food);
            System.out.printf("The monkey ate %s.\n", food);
        } else {
            System.out.println("The monkey is full of food.");
        }
    }

    public void seeStomach() {
        System.out.println("The monkey stomach contains: " + stomach);
    }

    public void digest() {
        if (stomach.isEmpty()) {
            System.out.println("The monkey does not have any food to digest!");
        }
        else {
            String olderFood = stomach.get(0);
            stomach.remove(0);
            System.out.printf("The monkey digested the %s!\n", olderFood);
        }
    }
}

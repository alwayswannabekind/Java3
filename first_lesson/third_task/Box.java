package first_task.first_lesson.third_task;

import java.util.ArrayList;

public class Box {
    private double weight;
    private ArrayList<Fruit> fruits;

    public Box(ArrayList<Fruit> fruits) {
        this.fruits = fruits;
        fruits.clear();
    }

    public ArrayList<Fruit> getFruits() {
        return this.fruits;
    }

    public void getWeight() {
        try {
            if (((Fruit)this.getFruits().get(0)).getClass().toString() == "class geekbrains.third_task.Apple") {
                this.weight = (double)this.getFruits().size() * (new Apple()).getWeight();
            } else {
                this.weight = (double)this.getFruits().size() * (new Orange()).getWeight();
            }
        } catch (IndexOutOfBoundsException var2) {
            this.weight = 0.0;
        }

    }

    public boolean compareBoxes(Box box) {
        this.getWeight();
        box.getWeight();
        if (this.weight == box.weight) {
            System.out.println(true);
            return true;
        } else {
            System.out.println(false);
            return false;
        }
    }
}

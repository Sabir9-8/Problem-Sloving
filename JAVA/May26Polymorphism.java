package PolymorphismIntro;

public class May26Polymorphism {
    public static void main(String[] args) {
        May26Polymorphism m = new May26Polymorphism();
        m.display(new Deer());
        m.display(new Tiger());
        m.display(new Monkey());
    }

    public void display(Animal a) {
        a.eat();
        a.sleep();
        a.foodHabit();
    }
}

class Animal {
    void eat() {
        System.out.println("Animal is eating...");
    }

    void sleep() {
        System.out.println("Animal is sleeping...");
    }

    void foodHabit() {
        System.out.println("Animal is eating...");
    }
}

class Deer extends Animal {
    void eat() {
        System.out.println("Deer is eating grass");
    }

    void sleep() {
        System.out.println("Deer is Sleeping...");
    }

    void foodHabit() {
        System.out.println("Deer is Harbivorous");
    }
}

class Tiger extends Animal {
    void eat() {
        System.out.println("Tiger is eating meat");
    }

    void sleep() {
        System.out.println("Tiger is Sleeping...");
    }

    void foodHabit() {
        System.out.println("Tiger is Carnivorous");
    }
}

class Monkey extends Animal {
    void eat() {
        System.out.println("Monkey is eating banana...");
    }

    void sleep() {
        System.out.println("Monkey is Sleeping...");
    }

    void foodHabit() {
        System.out.println("Monkey is Omnivorous");
    }
}
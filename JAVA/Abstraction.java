package JAVA;

public class Abstraction {
    public static void main(String[] args) {
        Driver d = new Driver();
        Maruti800 m = new Maruti800();
        Innova i = new Innova();
        Ferrari f = new Ferrari();
        d.drive(m);
        m.racing();
        d.drive(i);
        i.hitAndKill();
        d.drive(f);
        f.write300WordEssay();
    }
}

class Driver
{
    public void drive(Car c) {
        c.start();
        c.accelerate();
        c.drive();
        c.combustion();
        c.stop();
    }
}

abstract class Car
{
    public void start() {
        System.out.println("Car is starting...");
    }
    abstract public void accelerate();
    abstract public void drive();
    abstract public void combustion();
    public void stop() {
        System.out.println("Car is stopping...");
    }
}

class Maruti800 extends Car
{
    public void accelerate() {
        System.out.println("Maruti800 accelerates upto 180 km/hr");
    }
    public void drive() {
        System.out.println("Maruti800 drives in a manual gear system");
    }
    public void combustion() {
        System.out.println("Maruti800 has a petrol engine");
    }
    public void racing() {
        System.out.println("Maruti800 is racing in death race...");
    }
}

class Innova extends Car
{
    public void accelerate() {
        System.out.println("Innova accelerates upto 240 km/hr");
    }
    public void drive() {
        System.out.println("Innova drives in a automatic gear system");
    }
    public void combustion() {
        System.out.println("Innova has a disel engine");
    }
    public void hitAndKill() {
        System.out.println("Innova is made for hit and kill");
    }
}

class Ferrari extends Car
{
    public void accelerate() {
        System.out.println("Ferrari accelerates upto 340 km/hr");
    }
    public void drive() {
        System.out.println("Ferrari drives in a turbo gear system");
    }
    public void combustion() {
        System.out.println("Ferrari has a white petrol engine");
    }
    public void write300WordEssay() {
        System.out.println("write 300 word essay and you are free..");
    }
}
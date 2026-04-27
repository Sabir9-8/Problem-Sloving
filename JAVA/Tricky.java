class A {
    A() {
        System.out.print("A ");
    }
}

class B extends A {
    int x;
    B() {
        System.out.print("B ");
        this.x = 10;
        this(10);
    }

    B(int x) {
        System.out.print(x + " ");
    }
}

public class Tricky {
    public static void main(String[] args) {
        new B();
    }
}
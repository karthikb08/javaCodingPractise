class Example1 {
    void print() {
        System.out.println("example1");
    }
}

class Example2 extends Example1 {
    @Override
    void print() {
        System.out.println("example2");
    }
}

class Example3 extends Example1 {
    @Override
    void print() {
        System.out.println("example3");
    }
}

public class Example4 {
    public static void main(String[] args) {
        Example1 e1 = new Example1();
        e1.print();

        Example1 e2 = new Example2();
        e2.print();

        Example1 e3 = new Example3();
        e3.print();
    }
}

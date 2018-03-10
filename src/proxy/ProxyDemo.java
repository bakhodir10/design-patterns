package proxy;


public class ProxyDemo {
    public static void main(String[] args) {
        Thing A = new aThing("A");

        // Result: "Hello: < A >"
        A.compute("Hello");

        A = new ThingLogging(A);

        // Result: "A: < A >"
        A.compute("A");

        Thing B = new bThing("B");

        // Result: "Hello: < B >"
        B.compute("Hello");

        B = new ThingLogging(A);

        // Result: "B: < A >"
        B.compute("B");
    }
}

package singleton;

public class RuntimeSingletonExample {
    public static void main(String args[]) {
        Runtime singletonRuntime = Runtime.getRuntime();

        singletonRuntime.gc();

        System.out.println(singletonRuntime);

        Runtime anotherInstance = Runtime.getRuntime();

        System.out.println(anotherInstance);
    }
}

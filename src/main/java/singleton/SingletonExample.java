package singleton;

public class SingletonExample {

    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();

        System.out.print(instance);

        Singleton anotherInstance = Singleton.getInstance();

        System.out.print(anotherInstance);
    }
}

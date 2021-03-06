package singleton;

public class Singleton {

    //make Singleton thread safe using volatile
    private static volatile Singleton instance = null;

    private Singleton(){
        if(instance != null){
            throw new RuntimeException("Use getInstance() method to create");
        }
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if(instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}

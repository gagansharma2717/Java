package Singleton_Pattern;

public class LazySingleton {
    private static LazySingleton instance = null;

    private LazySingleton(){

    }

    public static LazySingleton getInstance(){
        if(instance == null){
            instance = new LazySingleton();
        }

        return instance;
    }
}

/* The problem with this lazy initialization is it will be broken in multi-threading environment.
* First Possible solution is Eager Initialization*/
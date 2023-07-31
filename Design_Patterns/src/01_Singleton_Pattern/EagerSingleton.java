package Singleton_Pattern;

public class EagerSingleton {
    private static final EagerSingleton eager_instance = new EagerSingleton();

    private EagerSingleton(){

    }

    public static EagerSingleton getInstance(){
        return eager_instance;
    }
}

/* This problem with eager initialization is The instance is getting created in memory whether it is used or not.
* This can lead to wastage of resources bcoz resources are allocated to that instance whether it is used or not.
* Another approach which prevents wastage of resources and also multithreading is using synchronized method or block.
 */
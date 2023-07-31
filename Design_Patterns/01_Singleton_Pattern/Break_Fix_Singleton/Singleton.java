package Break_Fix_Singleton;

import java.io.Serializable;

public class Singleton implements Cloneable, Serializable {
    private static Singleton instance = null;

    private Singleton(){
        // Prevent from reflection api
        if(instance != null){
            throw new IllegalStateException("Object can't be created using reflection!");
        }
    }

    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }

        return instance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
        throw new CloneNotSupportedException(); // prevention from cloning
    }

    /* To prevent from Deserialization*/
    protected Object readResolve(){
        return instance;
    }
}

/* Clone method is present in object class and modifier is protected. So we can directly access clone method
*  It can also be broken in inheritance when this Singleton class is child of some other class and that other
*  class implements clone interface. In same way we can override clone method in Singleton class and can throw
*  CloneNotSupportedException(); */

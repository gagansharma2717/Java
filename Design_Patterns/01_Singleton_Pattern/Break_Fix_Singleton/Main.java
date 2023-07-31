package Break_Fix_Singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException, InvocationTargetException, InstantiationException, IllegalAccessException, IOException, ClassNotFoundException {
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance1.hashCode());

        /* Using Clone
        Singleton instance2 =(Singleton) instance1.clone();
        System.out.println(instance2.hashCode()); */

       /* Using Reflection
         Singleton reflectionInstance = null;

        Constructor[] constructors = Singleton.class.getDeclaredConstructors();
        for(Constructor constructor : constructors ){
            constructor.setAccessible(true);
            reflectionInstance = (Singleton) constructor.newInstance();
        }

        System.out.println(reflectionInstance.hashCode()); */

        /* Using De-Serialization */
        ObjectOutput out = new ObjectOutputStream(new FileOutputStream("Serialize.ser"));
        out.writeObject(instance1);
        out.close();

        ObjectInput in = new ObjectInputStream(new FileInputStream("Serialize.ser"));
        Singleton instance2 = (Singleton) in.readObject();
        in.close();

        System.out.println(instance2.hashCode());

    }
}

/* Singleton pattern can be break by multi-threading that we have covered earlier -
*  Using Synchronized block with class level locking with double null check we can prevent it

*  Second one is Serialization-Deserialization - prevent by overriding readResolve method

* Cloning the object - prevent by throwing CloneNotSupportedException() in overridden clone method

* Using reflection api -  prevent by throwing IllegalStateException in Singleton class constructor.
 */
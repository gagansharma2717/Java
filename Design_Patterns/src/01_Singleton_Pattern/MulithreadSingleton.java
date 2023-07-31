package Singleton_Pattern;

public class MulithreadSingleton {
    private static MulithreadSingleton mulithreadInstance = null;

    private MulithreadSingleton(){

    }

    /* If we use Synchronized method that it can lead to long waiting time for threads.
    *  So instead of synchronized method we will use synchronized block*/

    public static MulithreadSingleton getInstance(){
        if(mulithreadInstance == null){
        /* Question will arise here why two null checks. So for example 2 threads are entering this method
        * to create object. Object is not created yet so both should if object is created or not*/
            synchronized (MulithreadSingleton.class){
                /* This method is static so we are using class level locking*/
                if(mulithreadInstance == null){
                    /* Second null check is when T1 enters this synchronized block It will create instance
                    * But when T2 will enters this block It should be creating new instance bcoz T1 already created it
                    * So second null check is for that purpose*/

                    mulithreadInstance = new MulithreadSingleton();
                }
            }
        }
        return mulithreadInstance;
    }
}

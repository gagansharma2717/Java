package Singleton_Pattern;

public class Main {
    public static void main(String[] args) {
        LazySingleton ob1 = LazySingleton.getInstance();
        LazySingleton ob2 = LazySingleton.getInstance();

        System.out.println("Lazy 1 : " + ob1.hashCode());
        System.out.println("Lazy 1 : " + ob2.hashCode());

        EagerSingleton ob3 = EagerSingleton.getInstance();
        EagerSingleton ob4 = EagerSingleton.getInstance();

        System.out.println("Eager 1 : "+ ob3.hashCode());
        System.out.println("Eager 2 : " + ob4.hashCode());

        MulithreadSingleton ob5 = MulithreadSingleton.getInstance();
        MulithreadSingleton ob6 = MulithreadSingleton.getInstance();

        System.out.println("Multithread 1 : "+ ob5.hashCode());
        System.out.println("Mulithread 2 : " + ob6.hashCode());
    }
}



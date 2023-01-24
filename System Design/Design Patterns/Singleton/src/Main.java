public class Main {
    public static void main(String[] args) {
        System.out.println("Singleton Demo");
        SingletonClass singletonClass=SingletonClass.getInstance();
        System.out.println("singleton class 1 hashcode : "+singletonClass.hashCode());
        SingletonClass singletonClass2=SingletonClass.getInstance();
        System.out.println("singleton class 2 hashcode : "+singletonClass2.hashCode());
        NonSingletonClass nonSingletonClass=new NonSingletonClass();
        System.out.println("non singleton class 1 hashcode : "+nonSingletonClass.hashCode());
        NonSingletonClass nonSingletonClass1=new NonSingletonClass();
        System.out.println("non singleton class 2 hashcode : "+nonSingletonClass1.hashCode());
        Intanciator intanciator=new Intanciator();
        Thread thread=new Thread(intanciator);
        Thread thread1=new Thread(intanciator);
        thread.start();
        thread1.start();
    }
}
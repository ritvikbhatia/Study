public class SingletonClass {
    private static SingletonClass singletonObject=null;
    private SingletonClass(){}
    public static SingletonClass getInstance()
    {
        if(singletonObject!=null)
        {
            return singletonObject;
        }
        singletonObject=new SingletonClass();
        return singletonObject;
    }
}

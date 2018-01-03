package singleton;

/**
 * @author haozt
 * @date 2018/1/3 15:00
 * 静态内部类方式
 * 使用类加载器 保证初始化instance时只有一个线程
 */
public class Singleton4 {
    private static class SingletonHolder{
        private static Singleton4 INSTANCE = new Singleton4();
    }
    private Singleton4(){}
    public static Singleton4 getInstance(){
        return  SingletonHolder.INSTANCE;
    }
}

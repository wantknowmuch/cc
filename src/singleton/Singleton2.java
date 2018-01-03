package singleton;

/**
 * @author haozt
 * @date 2018/1/3 14:47
 * 饿汉式
 */
public class Singleton2 {
    private static Singleton2 instance = new Singleton2();
    private Singleton2(){
    }
    public static Singleton2 getInstance(){
        return  instance;
    }
}

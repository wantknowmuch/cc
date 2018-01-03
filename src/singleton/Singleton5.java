package singleton;

/**
 * @author haozt
 * @date 2018/1/3 15:11
 * 懒汉式 变种
 */
public class Singleton5 {
    private static Singleton5 instance ;
    private Singleton5(){}
    static {
        instance = new Singleton5();
    }

    public static Singleton5 getInstance() {
        return instance;
    }
}

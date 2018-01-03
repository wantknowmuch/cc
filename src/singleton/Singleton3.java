package singleton;

/**
 * @author haozt
 * @date 2018/1/3 14:50
 * 懒汉式 线程安全
 */
public class Singleton3 {
    private static Singleton3 instance;
    private Singleton3(){}
    public static synchronized Singleton3 getInstance(){
        if(null == instance){
            return new Singleton3();
        }
        return instance;
    }
}

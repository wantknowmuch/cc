package singleton;

/**
 * @author haozt
 * @date 2018/1/3 15:19
 * 双重检验锁
 * jdk1.5之后
 */
public class Singleton7 {
    private volatile static Singleton7 instance;
    private Singleton7(){}
    public  static Singleton7 getInstance(){
        if(instance == null){
            synchronized (Singleton7.class){
                if(instance == null){
                    instance = new Singleton7();
                }
            }
        }
        return  instance;
    }
}

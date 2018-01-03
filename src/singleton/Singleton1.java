package singleton;

/**
 * @author haozt
 * @date 2018/1/3 14:24
 * 单例模式：单例类只有一个实例，单例类必须为自己创建一个实例，单例类必须对外提供唯一的实例
 * 静态方法中是不允许出现 this和super关键字
 * 懒汉式 线程不安全
 */
public class Singleton1 {
    private static Singleton1 instance =null;
    private Singleton1(){
    }
    public static Singleton1 getInstance(){

        if(instance == null){
            instance = new Singleton1();
            return instance;
        }
        return instance;
    }
}

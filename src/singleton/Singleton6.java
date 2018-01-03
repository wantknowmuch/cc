package singleton;

/**
 * @author haozt
 * @date 2018/1/3 15:14
 * 使用枚举 jdk1.5后加入了枚举
 */
public enum Singleton6 {
    INSTANCE;
    //使用枚举，避免线程同步问题，防止反序列化重新创建新对象
    public void whatEverMethod(){

    }
}

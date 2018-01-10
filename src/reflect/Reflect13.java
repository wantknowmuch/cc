package reflect;

import java.lang.reflect.Field;

/**
 * @author haozt
 * @date 2018/1/10 11:21
 * 将反射使用于工厂模式
 */
public class Reflect13 {
    public static void main(String[] args){
        Fruit f = Factory.getInstance("reflect.Apple");
        if(f != null){
            f.eat();
        }
    }
}
interface Fruit{
    public void  eat();
}
class Apple implements Fruit{

    @Override
    public void eat() {
        System.out.println("apple");
    }
}
class  Orange implements Fruit{

    @Override
    public void eat() {
        System.out.println("orange");
    }
}
class Factory{
    public static Fruit getInstance(String className){
        Fruit f = null;
        try {
            f = (Fruit) Class.forName(className).newInstance();
        }catch (Exception e){
            e.printStackTrace();
        }
        return f;
    }
}

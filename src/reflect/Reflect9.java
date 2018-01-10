package reflect;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author haozt
 * @date 2018/1/10 9:58
 * 反射机制的动态代理
 */
public class Reflect9 {

    public static void main(String[] args){
        Reflect9 reflect9 = new Reflect9();
        //获取类加载器的方法
        System.out.println("类加载器"+ reflect9.getClass().getClassLoader().getClass().getName());
        MyInvocationHandler invocationHandler = new MyInvocationHandler();
        Subject sub =(Subject) invocationHandler.bind(new RealSubject());
        String info = sub.say("ladygaga",34);
        System.out.println(info);
    }
}
interface Subject{
    public String say(String name,int age);
}
class RealSubject implements Subject{

    @Override
    public String say(String name, int age) {
        return name +" "+ age;
    }
}

/**
 * java中有3种类加载器
 * 1）bootstrap ClassLoader 此加载器采用C++编写 一般在开发中很少见
 * 2）Extension ClassLoader 用来进行扩展类的加载，一般对应的是jrelibext目录中的类
 * 3）APPClassLoader 加载classpath指定的类，是最常用的加载器，同时也是java中默认的加载器。
 * 如果想要完成动态代理，首先需要定义 InvocationHandler接口的子类，已完成代理的具体操作
 */
class MyInvocationHandler implements InvocationHandler{
    private Object obj = null;
    public Object bind(Object obj){
        this.obj = obj;
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(),obj.getClass().getInterfaces(),this);
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object temp = method.invoke(this.obj,args);
        return temp;
    }
}
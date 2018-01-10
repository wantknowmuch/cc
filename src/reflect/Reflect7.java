package reflect;

import java.lang.reflect.Method;

/**
 * @author haozt
 * @date 2018/1/10 9:25
 * 通过反射机制调用某个类的方法
 */
public class Reflect7 {
    public static void main(String[] args) throws Exception{
        Class<?> clazz =  Class.forName("reflect.Reflect7");
        //通过反射机制 调用reflect1（）
        Method method = clazz.getMethod("reflect1");
        method.invoke(clazz.newInstance());
        Method method2 = clazz.getMethod("reflect2", String.class, int.class);
        method2.invoke(clazz.newInstance(),"zhangsan",20);
    }
    public void reflect1(){
        System.out.println("java反射机制--- 调用某个类的方法1");
    }
    public void reflect2(String name , int age){
        System.out.println("java反射机制--- 调用某个类的方法2");
        System.out.println("age:"+age +",name:"+name);
    }
}

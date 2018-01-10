package reflect;

import java.io.Serializable;

/**
 * @author haozt
 * @date 2018/1/8 13:54
 * 获取一个对象的父类与实现的接口
 */
public class Reflect3 implements Serializable{
    //类型通配符  类型通配符的上限和下限
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> clazz = Class.forName("reflect.Reflect3");
       //取得父类
        Class<?> parentClass  = clazz.getSuperclass();
        //获取所有的接口
        System.out.println("clazz的父类："+parentClass.getName());
        Class<?> inter[]  =  clazz.getInterfaces();
        System.out.println("clazz的接口有：");
        for(int i = 0; i<inter.length;i++){
            System.out.println(inter[i].getName());

        }
    }

}

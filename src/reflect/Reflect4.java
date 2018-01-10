package reflect;

import java.lang.reflect.Constructor;

/**
 * @author haozt
 * @date 2018/1/8 16:54
 * 获取某个类中的全部构造函数
 * 通过反射机制实例化一个类的对象
 */
public class Reflect4 {
    public static void main(String[] args) throws Exception {
        Class<?> clazz = null;
        clazz = Class.forName("reflect.User");
        //第一种 方法，实例化默认构造方法，调用set赋值
        User user = (User)clazz.newInstance();
        user.setAge(13);
        user.setName("zhangsan");
        System.out.println(user);
        //第二种方法，取得全部的构造函数，使用构造函数赋值
        Constructor<?> cons[] = clazz.getConstructors();
        //查看每个构造方法所需要的参数
        for(int i = 0;i<cons.length;i++){
            Class<?>[] clazzs = cons[i].getParameterTypes();
            System.out.print("cons["+i+"](");
            for(int j =0;j<clazzs.length;j++){
                if(j == clazzs.length -1){
                    System.out.println(clazzs[j].getName());
                }else{
                    System.out.println(clazzs[j].getName()+",");
                }
            }
            System.out.println(")");
        }
        user =(User) cons[2].newInstance("rollen");
        System.out.println(user);
        user = (User)cons[3].newInstance("Jellen",20);
        System.out.println(user);
    }
}

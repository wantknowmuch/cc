package reflect;

import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * @author haozt
 * @date 2018/1/10 10:44
 * 反射机制的应用实例
 */
public class Reflect10 {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<>();
        Method method = list.getClass().getMethod("add",Object.class);
        method.invoke(list,"reflect test");
        System.out.println(list.get(0));
    }
}

package reflect;

import java.lang.reflect.Field;

/**
 * @author haozt
 * @date 2018/1/10 9:43
 * 通过反射机制操作某个类的属性
 */
public class Reflect8 {
    private String property = null;
    public static void main(String[] args)throws Exception{
        Class<?> clazz = Class.forName("reflect.Reflect8");
        Object o = clazz.newInstance();
        //可以直接对private的 属性赋值
        Field field = clazz.getDeclaredField("property");
        field.setAccessible(true);
        field.set(o,"java反射机制");
        System.out.println(field.get(o));
    }
}

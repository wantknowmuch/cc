package reflect;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * @author haozt
 * @date 2018/1/9 10:03
 * 获取某个类的全部属性
 */
public class Reflect5 implements Serializable {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> clazz = Class.forName("reflect.Reflect5");
        System.out.println("========本类属性========");
        //取得本类的全部属性
        Field[] field = clazz.getDeclaredFields();
        for(int i = 0; i<field.length;i++){
            //获取权限修饰符
            int modifiers = field[i].getModifiers();
            String priv = Modifier.toString(modifiers);
            //属性类型
            Class<?> type = field[i].getType();
            System.out.println(priv + "" +type.getName()+"" +field[i].getName());
        }
        //获取实现的接口或者父类的属性
        Field[] fields = clazz.getFields();
        for(int i =0;i<fields.length;i++){
            int modifiers = fields[i].getModifiers();
            String pro = Modifier.toString(modifiers);
            Class<?> type = fields[i].getType();
            System.out.println(pro+ "" + type.getName()+""+fields[i].getName());
        }
    }
}

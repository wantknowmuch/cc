package reflect;


/**
 * @author haozt
 * @date 2018/1/8 13:16
 * 实例化Class类对象
 */
public class Reflect2 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> class1 = null;
        Class<?> class2 = null;
        Class<?> class3 = null;
        class1 = Class.forName("reflect.Reflect2");
        class2 = Reflect2.class;
        class3 = new Reflect2().getClass();
        System.out.println("类名称："+class1);
        System.out.println("类名称："+class2);
        System.out.println("类名称："+class3);

    }
}

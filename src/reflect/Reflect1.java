package reflect;

/**
 * @author haozt
 * @date 2018/1/8 11:36
 *
 * java 中反射机制：反射机制是在运行状态中，对于任何一个类，都能知道这个类的所有属性和方法；
 * 对于任意一个对象，都能够调用它的任意一个方法和属性；这种动态获取的信息以及动态调用对象的方法
 * 的功能称之为java语言的反射机制。
 *
 * 反射机制能做什么：在运行时判断任意一个对象所属的类；在运行时构造任意一个类的对象；在运行时
 * 判断任意一个类所具有的成员变量和方法；在运行时调用任意一个对象的方法；生成动态代理。
 */
public class Reflect1 {
    public static void main(String[] args){
        //通过一个对象获取完整的包名和类名
            Reflect1 reflect = new Reflect1();
        System.out.println(reflect.getClass().getName());
        //运行结果：reflect.Reflect1  包名.类名
    }
}

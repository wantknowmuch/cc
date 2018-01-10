package reflect;

import java.lang.reflect.Array;

/**
 * @author haozt
 * @date 2018/1/10 10:52
 * 通过反射取得并修改数组信息
 */
public class Reflect11 {
    public static void main(String[] args){
        int temp[] = {1,2,3,4,5};
        Class<?> demo = temp.getClass().getComponentType();
        System.out.println("数组类型："+demo.getName());
        System.out.println("数组长度："+ Array.getLength(temp));
        System.out.println("数组中的第一个元素："+Array.get(temp,0));
        Array.set(temp,0,200);
        System.out.println("修改后的数组的第一个元素为："+Array.get(temp,0));
    }
}

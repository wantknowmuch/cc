package reflect;

import java.lang.reflect.Array;

/**
 * @author haozt
 * @date 2018/1/10 11:04
 * 通过反射机制修改数组的大小
 */
public class Reflect12 {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int[] newArr = (int[]) arrayInc(arr,15);
        print(newArr);
        String[] strings = new String[]{"abd","abc","defer"};
        String[] strings1 = (String[]) arrayInc(strings,23);
        print(strings1);
    }
    //数组扩容
    public static Object arrayInc(Object obj,int len){
        Class<?> arr = obj.getClass().getComponentType();
        Object newArr = Array.newInstance(arr,len);
        int co = Array.getLength(obj);
        System.arraycopy(obj,0,newArr,0,co);
        return newArr;
    }
    public static void print(Object obj){
        Class<?> c = obj.getClass();
        if(!c.isArray()){
            return;
        }
        System.out.println("数组的长度为："+Array.getLength(obj));
        for(int i = 0 ;i < Array.getLength(obj);i++){
            System.out.print(Array.get(obj,i)+" ");
        }
        System.out.println();
    }
}

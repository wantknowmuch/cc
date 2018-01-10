package reflect;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * @author haozt
 * @date 2018/1/9 11:24
 * 获取某个类的全部方法
 */
public class Reflect6 {
    public static void main(String[] args) throws Exception{
        Class<?> clazz = Class.forName("reflect.Reflect6");
        Method[] method = clazz.getMethods();
        for(int i=0;i<method.length;i++){
            Class<?> returnType = method[i].getReturnType();
            Class<?>[] paramType = method[i].getParameterTypes();
            int temp = method[i].getModifiers();
            System.out.println(Modifier.toString(temp));
            System.out.println(returnType.getName());
            System.out.println(method[i].getName());
            for(int j = 0;j<paramType.length;j++){
                System.out.print(paramType[j].getName()+" ");
            }
            Class<?>[] exception = method[i].getExceptionTypes();
            for(int k = 0; k<exception.length;k++){
                System.out.print(exception[k].getName()+" ");
            }
        }
    }
}

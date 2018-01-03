package bb;

/**
 * @author haozt
 * @date 2018/1/3 13:08
 * 练习使用适配器模式
 */
public class AImpl extends A {
    public void workA(){
        System.out.println("我是A");
    }
    public static void work(A a){
        System.out.println("----开始----");
        a.workA();
        System.out.println("-----结束-----");
    }
    public static void main(String args[]){
        A a = new AImpl();
        work(a);
        B b = new BImpl();
        Adapter adapter = new Adapter(b);
        work(adapter);
    }
}

package bb;

/**
 * @author haozt
 * @date 2018/1/3 13:06
 */
public class Adapter extends A {
    public B b;
    public  Adapter(B b){
        this.b = b;
    }
    public void workA(){
        b.workB();
    }

}

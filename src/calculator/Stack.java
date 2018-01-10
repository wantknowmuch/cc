package calculator;

import java.util.ArrayList;

/**
 * @author haozt
 * @date 2018/1/2 14:16
 * 数据结构 栈
 */
public class Stack<T> {
    private ArrayList<T> stack;

    /**
     * 构造方法，初始化栈
     */
    public Stack(){
        this.stack = new ArrayList<>();
    }

    /**
     *  查看栈顶元素
     * @return
     */
    public T peek(){
        if(this.stack.size()>0){
            return this.stack.get(this.stack.size()-1);
        }else{
            return null;
        }
    }

    /**
     * 将元素压入栈
     * @param t
     * @return
     */
    public boolean push(T t){
        boolean flag = false;
        if(t != null){
            this.stack.add(t);
            flag = true;
        }
        return  flag;
    }

    public T pop(){
        if(this.stack != null) {
            return this.stack.remove(this.stack.size() - 1);
        }else {
            return null;
        }
    }

    /**
     * 判断一个栈是否为空
     * @return
     */
    public boolean isEmpty(){
        return this.stack.size() == 0;
    }

    /**
     * 返回栈内元素的个数
     * @return
     */
    public int size(){
        return this.stack.size();
    }

    @Override
    public String toString(){
        StringBuffer buffer = new StringBuffer();
        buffer.append("{");
        for(int i = 0; i<this.stack.size(); i++){
            buffer.append(this.stack.get(i));
           if(i != this.stack.size()-1)
            buffer.append(",");
        }
        buffer.append("}");
        return buffer.toString();
    }
}

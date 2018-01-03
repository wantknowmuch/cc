package calculator;

/**
 * @author haozt
 * @date 2018/1/2 14:17
 * 处理表达式
 */
public class ExpressionParser {
    //创建一个符号栈
    private Stack<Character> characterStack;
    //创建一个数字栈
    private Stack<Double> doubleStack;

    private StringBuffer expression;

    /**
     * 初始化表达式
     */
    public ExpressionParser(StringBuffer expression){
        this.expression = expression;
        this.doubleStack = new Stack<>();
        this.characterStack = new Stack<>();
    }

    /**
     * 计算表达式的值
     * @return
     */
    public double parse(){
        //当表达式还没有解析完
        while (this.expression.length()>0){
            //获取当前表达式的第一个字符
            char ch = this.expression.charAt(0);
            this.expression.deleteCharAt(0);
            double num = 0;
            boolean existNum = false;
            char a = '.';
            //若当前读取到的是数字
            while(ch>='0' && ch <='9' || ch == '.'){
                num = num * 10 +ch -'0' ;
                existNum = true;
                if(this.expression.length()>0){
                    ch = this.expression.charAt(0);
                    this.expression.deleteCharAt(0);
                }else{
                    break;
                }
            }
            //当数字解析完成时，将数字压入栈
            if(existNum){
                this.doubleStack.push(num);
                //当前表达式解析完成，则跳出当前循环
                if(this.expression.length() == 0 && ch >='0' && ch<='9'){
                    break;
                }
            }
            //若符号栈为空或者栈顶元素为左括号或者ch本身就是左括号 直接将符号压入栈底
            if(this.characterStack.isEmpty()||this.characterStack.peek()=='('|| ch=='('){
                this.characterStack.push(ch);
                continue;
            }
            switch (ch){
                case ')':{
                    while(this.doubleStack.size()>=2 && !this.characterStack.isEmpty() && this.characterStack.peek() !='('){
                        this.calculate();
                    }
                    if(!this.characterStack.isEmpty() && this.characterStack.peek() =='('){
                        this.characterStack.pop();
                        continue;
                    }else{
                        System.out.println("妈卖批的，肯定少输入括号了");
                        throw new IllegalArgumentException("括号数目不匹配");
                    }
                }
                case '*':
                case '/':
                case '%':{
                    //这里需要考虑到优先级 + -优先级一致 * / % 优先级一致 需要判断此刻栈顶元素符号
                    //(4+3*7+12*（3+7）)+18  如果当前栈顶元素不是 + - 则可以直接进行运算 否则需要把
                    //当前的ch 压入栈
                    while (this.doubleStack.size()>=2 &&!(this.characterStack.isEmpty() ||this.characterStack.peek() == '('|| this.characterStack.peek()=='+'||this.characterStack.peek()=='-')){
                        this.calculate();
                    }
                    if(this.characterStack.isEmpty() ||this.characterStack.peek() == '(' ||
                            this.characterStack.peek() == '+' || this.characterStack.peek() =='-'){
                        this.characterStack.push(ch);
                        continue;
                    }
                }
                case '+':
                case '-':{
                    //若当前符号栈 栈顶元素不是“（”，也不是空，则可以将符号栈元素弹出 然后进行运算
                    while (this.doubleStack.size()>=2 &&(!this.characterStack.isEmpty() ||this.characterStack.peek() !='(')){
                        this.calculate();
                    }
                    if(this.characterStack.isEmpty() || this.characterStack.peek()=='('){
                        this.characterStack.push(ch);
                        continue;
                    }else{
                        throw new IllegalArgumentException("表达式格式不合法");
                    }
                }
                default:throw new IllegalArgumentException("运算符不合法");

            }

        }
        while (!this.characterStack.isEmpty()){
            this.calculate();
        }
        return this.doubleStack.size()==1?this.doubleStack.pop():null;
    }

    //进行表达式运算
    private void calculate(){
        double b = this.doubleStack.pop();
        double a = this.doubleStack.pop();
        char c = this.characterStack.pop();
        double result = 0;
        switch (c){
            case '+': result = a+b; break;
            case '-': result = a-b; break;
            case '*': result = a*b; break;
            case '/':
                if(b==0){
                    throw  new ArithmeticException("除数不能为0");
                }
                result = a/b; break;
            case '%':
                if(b == 0){
                    throw  new ArithmeticException("除数不能为0");
                }
                result = a%b; break;
        }
        //将运算结果压入栈底
        this.doubleStack.push(result);
    }
}

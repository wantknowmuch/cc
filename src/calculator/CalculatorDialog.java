package calculator;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author haozt
 * @date 2018/1/2 14:15
 * 计算器界面
 */
public class CalculatorDialog extends JFrame implements ActionListener{

    private JPanel panel;
    private String[]  strings;
    private JButton[] buttons;
    private JTextField textField;
    private StringBuffer text ;
    public void initUI(){
        this.setSize(350,240);
        this.setLayout(new FlowLayout());
        this.textField = new JTextField();
        this.text = new StringBuffer();
        this.textField.setPreferredSize(new Dimension(174,20));
        //创建具有指定行数、列数以及组件水平、纵向一定间距的网格布局
        this.panel = new JPanel(new GridLayout(5,4,3,3));
        this.strings =new String[]{"7","8","9","/","4","5","6","*","1","2","3","-","0",".","=","+","(",")","{","}"};
        this.buttons = new JButton[strings.length];
        this.setTitle("计算器");
        //添加按钮组件
        for(int i = 0; i< strings.length;i++){
            buttons[i] = new JButton(strings[i]);
            buttons[i].addActionListener(this);
            this.panel.add(buttons[i]);
        }
        this.getContentPane().add(textField,BorderLayout.NORTH);
        this.getContentPane().add(panel,BorderLayout.CENTER);
        this.setVisible(true);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

    }
    public static void main(String[] args){
        CalculatorDialog dialog = new CalculatorDialog();
        dialog.initUI();
    }

    /**
     * 添加按钮监听事件
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if(!e.getActionCommand().equals("=")){
            this.text.append(e.getActionCommand());
            this.textField.setText(text.toString());
        }else{
            StringBuffer s = this.text;
            String str = this.text.toString();
            ExpressionParser parser = new ExpressionParser(s);
            double sum = parser.parse();
            this.textField.setText(str+s.append("=").append(Double.toString(sum)).toString());
            System.out.println(sum);
        }

    }

}

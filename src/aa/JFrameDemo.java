package aa;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

/**
 * @author haozt
 * @date 2018/1/2 10:17
 * 练习使用网格布局
 */
public class JFrameDemo extends JFrame implements ActionListener{

    private JPanel panel;
    private String[]  strings;
    private JButton[] buttons;
    private JTextField textField;
    private String text = "";
    public void initUI(){
        this.setSize(350,200);
        this.setLayout(new FlowLayout());
        this.textField = new JTextField();
        this.textField.setPreferredSize(new Dimension(174,20));
//        this.textField.setLayout(new GridBagLayout());
//        this.textArea = new JTextArea();
        //创建具有指定行数、列数以及组件水平、纵向一定间距的网格布局
        this.panel = new JPanel(new GridLayout(4,4,3,3));
        this.strings =new String[]{"7","8","9","/","4","5","6","*","1","2","3","-","0",".","=","+"};
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
//        JFrameDemo demo = new JFrameDemo();
//        demo.initUI();
        char a='0';
        char b = '1';
        char c='9';
        char d='a';
        char m = 65;
        char n = 48;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(m);
        System.out.println(n);
    }

    /**
     * 添加按钮监听事件
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if(!e.getActionCommand().equals("=")){
            this.text += e.getActionCommand();
            this.textField.setText(text);
        }else{
            String s = this.text;
            System.out.println(s);
        }

//        textField.setText(e.getActionCommand());
    }





}

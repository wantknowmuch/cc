package aa;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static com.sun.deploy.uitoolkit.ToolkitStore.dispose;

/**
 * @author haozt
 * @date 2017/12/19 14:57
 */
public class CreateFolderDemo extends JDialog implements ActionListener{

    private JFrame jFrame;

//    private JPanel topPanel;

    private JPanel contentPanel;

    private JPanel buttonPanel;

    private JButton onButton;

    private JButton cancelButton;

    private JLabel textLabel;

    private JTextField textField;

    public static void main(String[] args){
        CreateFolderDemo demo = new CreateFolderDemo();
        demo.initUI();
    }

    public  void initUI(){
        this.jFrame = new JFrame("测试窗口");
        this.jFrame.setLayout(new FlowLayout());

        this.jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.jFrame.setSize(new Dimension(300,500));
//        this.topPanel = new JPanel(new FlowLayout());
//        this.topPanel.setPreferredSize(new Dimension(260,120));
        this.contentPanel = new JPanel(new FlowLayout());
        this.contentPanel.setPreferredSize(new Dimension(160,60));
        this.buttonPanel = new JPanel();
        this.buttonPanel.setLayout(null);
        buttonPanel.setPreferredSize(new Dimension(160,50));

        this.textLabel = new JLabel("请输入文件夹名称：");
        this.textLabel.setPreferredSize(new Dimension(120,20));
        this.textField = new JTextField(20);
        this.textField.setPreferredSize(new Dimension(120,20));
        this.onButton = new JButton("确定");
        onButton.setSize(140,40);
        onButton.setBounds(60,60,60,60);
        this.cancelButton = new JButton("取消");
        this.contentPanel.add("East",textField);
        this.contentPanel.add("West",textLabel);
        this.contentPanel.add(textLabel);
        this.contentPanel.add(textField);
        this.buttonPanel.add(onButton);
        this.buttonPanel.add(cancelButton);
//        this.jFrame.add(topPanel);
        this.jFrame.add(contentPanel,BorderLayout.CENTER);
        this.jFrame.add(buttonPanel,BorderLayout.SOUTH);
//        this.add(topPanel);
        this.onButton.addActionListener(this);
        this.cancelButton.addActionListener(this);

        jFrame.pack();
        jFrame.setVisible(true);

//        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.equals(onButton)){
            this.jFrame.dispose();
        }else{
            this.jFrame.dispose();
        }
    }
}

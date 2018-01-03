package aa;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author haozt
 * @date 2017/12/19 14:52
 */
public class SwingContainerDemo {
    private JFrame mainFrame;
    private JLabel headerLabel;
    private JLabel statusLabel;
    private JPanel controlPanel;
    private JLabel msglabel;

    public static void main(String[] args){
        SwingContainerDemo  swingContainerDemo = new SwingContainerDemo();
        swingContainerDemo.showJPanelDemo();
    }
    public SwingContainerDemo(){
        prepareGUI();
    }

    private void prepareGUI(){
        mainFrame = new JFrame("Java Swing ");
        mainFrame.setSize(400,400);
        mainFrame.setLayout(new GridLayout(3, 1));
        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent){
                System.exit(0);
            }
        });
        headerLabel = new JLabel("headerLabel ", JLabel.CENTER);
        statusLabel = new JLabel("statusLabel ",JLabel.CENTER);

        statusLabel.setSize(350,100);

        msglabel = new JLabel("Welcome  SWING ", JLabel.CENTER);

        controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());

        mainFrame.add(headerLabel);
        mainFrame.add(controlPanel);
        mainFrame.add(statusLabel);
        mainFrame.setVisible(true);
    }

    private void showJPanelDemo(){
        headerLabel.setText("Container in action: JPanel");

        JPanel panel = new JPanel();
        panel.setBackground(Color.magenta);
        panel.setLayout(new FlowLayout());
        panel.add(msglabel);

        controlPanel.add(panel);
        mainFrame.setVisible(true);
    }
}

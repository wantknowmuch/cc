package aa;

import javax.swing.*;
import java.awt.*;

/**
 * @author haozt
 * @date 2017/12/19 14:40
 */
public class JFrameExample implements Runnable{
    public static void main(String[] args){
        JFrameExample example = new JFrameExample();
        SwingUtilities.invokeLater(example);//执行线程
    }

    @Override
    public void run() {
        JFrame jFrame = new JFrame("测试窗口");
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setPreferredSize(new Dimension(400,200));
        jFrame.pack();
        jFrame.setVisible(true);
    }
}

package NPTEL;

import javax.swing.*;
public class Test {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.add(new JButton("Cancel"));
        frame.add(new JButton("OK"));
        frame.setSize(200, 200);
        frame.setVisible(true);
    }
}

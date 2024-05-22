package NPTEL;

import java.awt.*;
public class ButtonExample extends Frame {
    public static void main(String[] args) {
        ButtonExample frame = new ButtonExample();
        Button b = new Button("NPTEL - Programming in java");
        b.setBounds(30, 50, 80, 30);
        frame.add(b);
        frame.setSize(300, 200);
        frame.setLayout(null);
        frame.setVisible(true);

    }
}

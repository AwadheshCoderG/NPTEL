package NPTEL;
import java.awt.*;
public class GridLayoutExample extends Frame {
    public static void main(String[] args) {
        GridLayoutExample frame = new GridLayoutExample();
        Button b1 = new Button("Button 1");
        Button b2 = new Button("Button 2");
        Button b3 = new Button("Button 3");
        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.setLayout(new GridLayout(2, 2));
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}

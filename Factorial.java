package NPTEL;
import java.awt.*;
import java.awt.event.*;
class Factorial extends Frame implements ActionListener{

    TextField t1, t2;
    public Factorial(){
    setLayout(new FlowLayout());


    Label l1 = new Label("Enter a number: ");
    Label l2 = new Label("Factorial is: ");

    t1 = new TextField(15);
    t2 = new TextField(15);
    Button b = new Button("Calculate");

    add(l1); add(t1);
    add(l2); add(t2);
    add(b);
    b.addActionListener(this);}

     public static void main(String[] args){
     Factorial ft = new Factorial();
     ft.setSize(300, 300);
     ft.setTitle("Calculating Factorial");
     ft.setVisible(true);
     }

     public void actionPerformed(ActionEvent e){
        int n, f = 1, i;
        n = Integer.parseInt(t1.getText());
        for(i = 1; i <= n; i++){
            f = f * i;
        }
        t2.setText(" "+ f);
     }

}

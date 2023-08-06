import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class buttons{
    public static void main(String[] args) {
        Abc obj = new Abc();
    }
}

class Abc extends JFrame implements ActionListener {
    JLabel l1,l2;
    JButton b1,b2,b3;

    public Abc(){
        l1 = new JLabel("CLICK ANY BUTTON");
        b1 = new JButton("OK");
        b2 = new JButton("SUBMIT");
        b3 = new JButton("RESET");
        l2 = new JLabel("NONE");

        add(l1);
        add(b1);
        add(b2);
        add(b3);
        add(l2);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);


        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,400);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
            l2.setText("OK BUTTON CLICKED");
        }
        else if(ae.getSource()==b2){
            l2.setText("SUBMIT BUTTON CLICKED");
        }
        else if(ae.getSource()==b3){
            l2.setText("RESET BUTTON CLICKED");
        }
    }    
}
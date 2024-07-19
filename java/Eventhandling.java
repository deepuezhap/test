
import java.awt.*;
import java.awt.event.*;

public class Eventhandling extends Frame implements ActionListener {
        TextField tf;
        Eventhandling(){
                tf = new TextField();
                tf.setBounds(60,50,170,20);
                Button b = new Button("clice me");
                b.setBounds(100,120,80,30);

                b.addActionListener(this);
                add(b);
                add(tf);
                setSize(300,300);
                setLayout(null);
                setVisible(true);

        }
        public void actionPerformed(ActionEvent e){
                        tf.setText("welcommeee");
                        
        }
        public static void main (String args[]){
                new Eventhandling();

        }
}

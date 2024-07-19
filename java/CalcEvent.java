import java.awt.*;
import java.awt.event.*;

class CalcEvent extends Frame implements ActionListener{
    TextField tf1, tf2, tf3;
    Button sum;

    CalcEvent(){
        tf1 = new TextField("Enter the 1st number");
        tf2 = new TextField("Enter the 2nd number");
        tf3 = new TextField();
        
        // Set bounds for TextFields
        tf1.setBounds(50, 100, 200, 30);
        tf2.setBounds(50, 150, 200, 30);
        tf3.setBounds(50, 200, 200, 30);

        sum = new Button("Click here for sum");
        sum.setBounds(50, 250, 200, 30);
        sum.addActionListener(this);

        add(tf1);
        add(tf2);
        add(tf3);
        add(sum);

        setSize(300, 400);
        setLayout(null);
        setVisible(true);

    }


    public void actionPerformed(ActionEvent e)
    {

        int num1 = Integer.parseInt(tf1.getText());
        int num2 = Integer.parseInt(tf2.getText());

        // Calculate sum and set the result in the third TextField
        int result = num1 + num2;
        tf3.setText(String.valueOf(result));



    }



    public static void main(String[] args)
    {
        
        new CalcEvent();

    }
}
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdditionFrame extends JFrame {//extended JFrame so that when obj of AdditionFrame is made it will be a frame as it extends JFrame, or we can create an object of JFrame in my class
    private JPanel panel;
    private JLabel l1;
    private JLabel l2;
    private JLabel l3;
    private JTextField t1;
    private JTextField t2;
    private JButton b1;

    public void initComponents(){//Function to initialize components
        panel.setLayout(null);//To set the layout of the application, null means we can do on our will,every container has setLayout function
        l1.setBounds(100,80,100,20);
        t1.setBounds(205,80,100,20);
        l2.setBounds(100,110,120,20);
        t2.setBounds(205,110,100,20);
        b1.setBounds(150,150,100,20);
        l3.setBounds(120,180,180,20);
        panel.add(l1);//To add label on panel
        panel.add(t1);
        panel.add(l2);
        panel.add(t2);
        panel.add(b1);
        panel.add(l3);

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a=Integer.parseInt(t1.getText());
                int b=Integer.parseInt((t2.getText()));
                int c=a+b;
                l3.setText("Result of Addition is: "+c);
            }
        });



    }

    public AdditionFrame(){
        initComponents();//Components initialized
        setContentPane(panel);//To add the panel onto the frame
        setSize(400,400);//To set the size of JFrame
        setVisible(true);//To make visible
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//To make the cross on frame to terminate the program,the argument is an integer value

    }


}

import javax.swing.*;

public class AdditionFrame extends JFrame {//extended JFrame so that when obj of AdditionFrame is made it will be a frame as it extends JFrame, or we can create an object of JFrame in my class
    private JPanel panel;
    private JLabel l1;
    private JLabel l2;
    private JLabel l3;
    private JTextField t1;
    private JTextField t2;

    public void initComponents(){//Function to initialize components
        panel.setLayout(null);//To set the layout of the application, null means we can do on our will,every container has setLayout function
        l1.setBounds(100,50,100,20);
        t1.setBounds(188,50,100,20);
        panel.add(l1);//To add label on panel
        panel.add(t1);


    }

    public AdditionFrame(){
        initComponents();//Components initialized
        setContentPane(panel);//To add the panel onto the frame
        setSize(400,400);//To set the size of JFrame
        setVisible(true);//To make visible
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//To make the cross on frame to terminate the program,the argument is an integer value

    }
}

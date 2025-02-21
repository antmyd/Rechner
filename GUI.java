
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GUI {
    
    public static void main(String[] args) {

                        
        JFrame frame = new JFrame();

        Font font = new Font("Arial", Font.BOLD, 8);

        JTextField field1 = new JTextField();
        JTextField field2 = new JTextField();

        
        JButton plusButton = new JButton();
        JButton minusButton = new JButton();
        JButton geteiltButton = new JButton();
        JButton malButton = new JButton();

        JLabel label = new JLabel();

        frame.setSize(450, 450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.add(field1);
        frame.add(plusButton);
        frame.add(minusButton);
        frame.add(malButton);
        frame.add(geteiltButton);
        frame.add(field2);
        frame.add(label);

        //plusButton.setBounds(x, y, width, height);

        field1.setBounds(165, 60, 100, 30);

        plusButton.setBounds(140, 100, 30, 25);
        plusButton.setFont(font);
        ImageIcon icon = new ImageIcon("plus.png");
        Image image = icon.getImage().getScaledInstance(plusButton.getWidth(), plusButton.getHeight(), Image.SCALE_SMOOTH);
        plusButton.setIcon(new ImageIcon(image)); 
        plusButton.setFocusable(false);

        minusButton.setBounds(180, 100, 30, 25);
        minusButton.setFont(font);
        ImageIcon icon1 = new ImageIcon("minus.png");
        Image image1 = icon1.getImage().getScaledInstance(minusButton.getWidth(), minusButton.getHeight(), Image.SCALE_SMOOTH);
        minusButton.setIcon(new ImageIcon(image1)); 
        minusButton.setFocusable(false);


        malButton.setBounds(220, 100, 30, 25);
        malButton.setFont(font);
        ImageIcon icon2 = new ImageIcon("mal.png");
        Image image2 = icon2.getImage().getScaledInstance(malButton.getWidth(), malButton.getHeight(), Image.SCALE_SMOOTH);
        malButton.setIcon(new ImageIcon(image2)); 
        malButton.setFocusable(false);


        geteiltButton.setBounds(260, 100, 30, 25);
        geteiltButton.setFont(font);
        ImageIcon icon3 = new ImageIcon("geteilt.png");
        Image image3 = icon3.getImage().getScaledInstance(geteiltButton.getWidth(), geteiltButton.getHeight(), Image.SCALE_SMOOTH);
        geteiltButton.setIcon(new ImageIcon(image3)); 
        geteiltButton.setFocusable(false);

        field2.setBounds(165, 140, 100, 30);

        label.setBounds(165, 200, 100, 30);
        labelsetText(ergebnis);



    }
    
    
}
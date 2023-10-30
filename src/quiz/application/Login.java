package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener{
 
    JButton rules, Exit, Next;
    JTextField tfname;
    JLabel heading, name ;
    
    Login() {
        setTitle("JAVA CORE QUIZ TEST");
        getContentPane().setBackground(Color.BLACK);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/loginnnn.jpeg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, 600, 500);
        add(image);
        
        
        heading = new JLabel("Welcome to the Quiz");
        heading.setBounds(665, 20, 500, 45);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 44));
        heading.setForeground(new Color(255, 255, 254));
        add(heading);
        
        
        name = new JLabel("Enter your name");
        name.setBounds(810, 150, 300, 20);
        name.setFont(new Font("Mongolian Baiti", Font.BOLD, 18));
        name.setForeground(new Color(255, 255, 254));
        add(name);
        
        
        tfname = new JTextField();
        tfname.setBounds(735, 200, 300, 25);
        tfname.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(tfname);
        Next = new JButton("Next");
        Next.setBounds(835, 234, 90, 25);
        Next.setBackground(new Color(30, 144, 254));
        Next.setForeground(Color.WHITE);
        Next.addActionListener(this);
        add(Next);
        
        
        rules = new JButton("Rules");
        rules.setBounds(735, 270, 120, 25);
        rules.setBackground(new Color(30, 144, 254));
        rules.setForeground(Color.WHITE);
        rules.addActionListener(this);
        add(rules);
        
        Exit = new JButton("Exit");
        Exit.setBounds(915, 270, 120, 25);
        Exit.setBackground(new Color(30, 144, 254));
        Exit.setForeground(Color.WHITE);
        Exit.addActionListener(this);
        add(Exit);
        
        ImageIcon i2 = new ImageIcon(ClassLoader.getSystemResource("icons/side.jpeg"));
        image = new JLabel(i2);
        image.setBounds(300, 0, 1200, 500);
        add(image);
        
        setSize(1200, 500);
        setLocation(200, 150);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == Next) {
            String name = tfname.getText();
            setVisible(false);
            new Rules(name);
        } else if (ae.getSource() == Exit) {
            setVisible(false);
            
        }else if (ae.getSource()==rules){
            setVisible(false);
            new Rules("user");
        }
        
    }
//    public void actionPerformed(ActionEvent ae) {
//        if (ae.getSource() == Next) {
//            setVisible(false);
//            new Quiz(name);
//        } else {
//            setVisible(false);
//            new Login();
//        }
//    }
    public static void main(String[] args) {
        new Login();
    }
}
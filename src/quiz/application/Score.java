package quiz.application;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener {

    Score(String name, int score) {
        setBounds(400, 150, 750, 550);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/score2.png"));
        Image i2 = i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 150, 300, 250);
        add(image);
        
        JLabel heading = new JLabel("Thankyou " + name + " for Participate in Core Java Quiz Test");
        heading.setBounds(30, 40, 700, 30);
        heading.setFont(new Font("Times New Roman", Font.PLAIN, 32));
        heading.setForeground(new Color(30, 144, 254));
        add(heading);
        
        JLabel lblscore = new JLabel("Your score is " + score);
        lblscore.setBounds(300, 200, 300, 30);
        lblscore.setFont(new Font("Tahoma", Font.PLAIN, 36));
        lblscore.setBackground(Color.BLUE);
        lblscore.setForeground(Color.GREEN);
        add(lblscore);
        
        JButton submit = new JButton("Play Again");
        submit.setBounds(380, 270, 120, 30);
        submit.setBackground(new Color(30, 144, 255));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        add(submit);
        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/score1.jpg"));
        image = new JLabel(i4);
        image.setBounds(0, 0, 750, 550);
        add(image);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new Login();
    }

    public static void main(String[] args) {
        new Score("User", 0);
    }
}
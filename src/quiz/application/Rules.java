package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener{

    String name;
    JButton start, back;
    private final JLabel image;
    
    Rules(String name) {
        this.name = name;
        getContentPane().setBackground(Color.BLACK);
        setLayout(null);
        
        JLabel heading = new JLabel("Welcome " + name + " Before Start the quiz Please Read Rules");
        heading.setBounds(50, 20, 700, 30);
        heading.setFont(new Font("Times New Roman", Font.BOLD, 28));
        heading.setForeground(Color.GREEN);
        add(heading);
        
        JLabel rules = new JLabel();
        rules.setBounds(20, 90, 700, 350);
        rules.setFont(new Font("Tahoma", Font.PLAIN, 16));
        rules.setForeground(Color.WHITE);
        rules.setText(
            "<html>"+ 
                "1. You are trained to be a programmer  " + "<br><br>" +
                "2. If You have some Knowledge in core java only then you are eligible for this quiz test " + "<br><br>" +
                "3. You have Only 30 second of time for per question to give answer" + "<br><br>" +
                "4. If a team buzzes in and cannot answer or answers incorrectly, the question is then posed to the other team." + "<br><br>" +
                "5. If neither team gives a correct answer, the host moves on to another question" + "<br><br>" +
                "6. This continues until a correct answer is given and one team is declared the winner. There are no point deductions for wrong answers." + "<br><br>" +
                "7. Brace yourself, this paper is not for the faint hearted" + "<br><br>" +
                "8. May you know more than what John Snow knows, Good Luck" + "<br><br>" +
            "<html>"
        );
        add(rules);
        
        back = new JButton("Back");
        back.setBounds(250, 500, 100, 30);
        back.setBackground(new Color(30, 144, 254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        start = new JButton("Start");
        start.setBounds(400, 500, 100, 30);
        start.setBackground(new Color(30, 144, 254));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/rules.jpg"));
        image = new JLabel(i1);
        image.setBounds(0, 0, 800, 650);
        add(image);
        
        setSize(800, 650);
        setLocation(350, 100);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == start) {
            setVisible(false);
            new Quiz(name);
        } else {
            setVisible(false);
            new Login();
        }
    }
    
    public static void main(String[] args) {
        new Rules("User");
    }
}
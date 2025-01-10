/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package login;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author Vuyo
 */

public class Login extends JFrame implements ActionListener {

    JButton rules, Back;
    JTextField tfname;

    Login() {

        getContentPane().setBackground(Color.yellow);
        setLayout(null);


        ImageIcon I1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
        JLabel image = new JLabel(I1);
        image.setBounds(0, 0, 600, 500);
        add(image);

        JLabel heading = new JLabel("Simple Minds");
        heading.setBounds(750, 60, 300, 45);
        heading.setFont(new Font("Mongolian Baiti", Font.BOLD, 45));
        heading.setForeground(Color.BLUE);
        add(heading);

        tfname = new JTextField();
        tfname.setBounds(735, 200, 300, 25);
        tfname.setFont(new Font("Times New Roman ", Font.BOLD, 15));
        add(tfname);

         rules = new JButton("Rules");
        rules.setBounds(735, 270, 120, 25);
        rules.setBackground(Color.GREEN);
        rules.addActionListener(this);
        add(rules);

         Back = new JButton("Back");
        Back.setBounds(915, 270, 120, 25);
        Back.setBackground(Color.GREEN);
        Back.addActionListener(this);
        add(Back);

        JLabel name = new JLabel("Enter Your Name");
        name.setBounds(810, 150, 300, 20);
        name.setFont(new Font("Mongolian Baiti", Font.BOLD, 18));
        name.setForeground(Color.BLACK);
        add(name);


        setSize(1200, 500);
        setLocation(200, 150);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == rules) {
            String name = tfname.getText();
            setVisible(false);
            new Rule(name);

        } else if (ae.getSource() == Back) {
            setVisible(false);
        }
    }


    public static void main(String[] args) {
        new Login();
    }
}
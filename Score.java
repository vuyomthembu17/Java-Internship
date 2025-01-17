/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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
public class Score extends JFrame implements ActionListener {

    Score(String name,int  Score){

        setBounds(400,150,750,550);
        getContentPane().setBackground(Color.yellow);
        setLayout(null);

        ImageIcon I1 = new ImageIcon(ClassLoader.getSystemResource("icons/score.png"));
        Image i2 = I1.getImage().getScaledInstance(300,250,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 200, 300, 250);
        add(image);

         JLabel heading = new JLabel("Thank you " +name+" "+"for playing Quiz.");
        heading.setBounds(45,30,700,30);
        heading.setFont(new Font("Tahoma",Font.PLAIN,26));
        add(heading);

        JLabel score = new JLabel("Your Score is : " + Score);
        score.setBounds(350,200,300,30);
        score.setFont(new Font("Tahoma",Font.PLAIN,26));
        add(score);

        JButton submit = new JButton("Play Again");
        submit.setBounds(400,270,120,30);
        submit.setBackground(Color.green);
        submit.addActionListener(this);
        add(submit);

        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae){
         setVisible(false);
         new Login();
    }



    public static void main(String[] args) {
        new Score("User",0);
    }
}

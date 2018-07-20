package Lesson_4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Start extends JFrame {
    String name;
    Color AliceBlue = new Color(232, 250, 255);
    public Start() {

        setTitle("DZchat");
        setBounds(100, 100, 400, 100);
        ImageIcon icon = new ImageIcon("src/img/DZchat.png");
        setIconImage(icon.getImage());
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JPanel centerPanel = new JPanel();
        centerPanel.setBackground(AliceBlue);
        add(centerPanel, BorderLayout.CENTER);
        centerPanel.setLayout(new BorderLayout());

       JTextArea jtf = new JTextArea();
       add(jtf,BorderLayout.NORTH);
        jtf.setPreferredSize(new Dimension(400,40));

        JButton jb = new JButton("Log in");
        add(jb,BorderLayout.SOUTH);

        jtf.setText("Регистрация на DZchat \n Введите имя:");

        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                name = jtf.getText();

                name =name.replaceFirst("Регистрация на DZchat \n Введите имя:", "");
                System.out.println(name);
                jtf.setText("Регистрация на DZchat \n Введите имя:");
                if (name=="300"){
                    System.out.println("dff");
                    jtf.setText("(:");
                }
                new MyWindow(name);





            }
        });














        setVisible(true);

    }


}